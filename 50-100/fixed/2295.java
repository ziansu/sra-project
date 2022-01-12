@java.lang.Override
public double nextGaussian() {
    org.nd4j.linalg.jcublas.buffer.JCudaBuffer buffer = new org.nd4j.linalg.jcublas.buffer.CudaDoubleDataBuffer(1);
    curandGenerateUniformDouble(generator, buffer.pointer(), 1);
    double[] data = buffer.asDouble();
    buffer.destroy();
    return data[0];
}