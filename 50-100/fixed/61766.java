private void createPipesWindows() {
    do {
        inPipe = java.nio.file.Paths.get(("\\\\.\\pipe\\amz-aws-kpl-in-pipe-" + (com.amazonaws.services.kinesis.producer.Daemon.uuid8Chars()))).toFile();
    } while (inPipe.exists() );
    do {
        outPipe = java.nio.file.Paths.get(("\\\\.\\pipe\\amz-aws-kpl-out-pipe-" + (com.amazonaws.services.kinesis.producer.Daemon.uuid8Chars()))).toFile();
    } while (outPipe.exists() );
}