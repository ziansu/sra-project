public static void main(java.lang.String[] argv) throws java.io.IOException {
    jrnnlm.core.RNNLMConfiguration conf = new jrnnlm.core.RNNLMConfiguration();
    conf.trainStreamFactory = new jrnnlm.io.FileInputStreamFactory(new java.io.File("data/ptb.train.100.txt"));
    conf.validFile = new java.io.File("data/ptb.valid.txt");
    conf.hiddenSize = 30;
    conf.maxIters = 50;
    conf.fastMath = true;
    jrnnlm.core.RNNLM rnn = new jrnnlm.core.RNNLM(conf);
    jrnnlm.parallel.ParallelTrainer trainer = new jrnnlm.parallel.ParallelTrainer(rnn, 4);
    trainer.train();
    rnn.save(argv[2]);
}