@java.lang.Override
public void process(float[] channels, sample.complex.IComplexSampleListener listener) {
    listener.receive(getFrequencyCorrectedInphase(i, q), getFrequencyCorrectedQuadrature(i, q));
}