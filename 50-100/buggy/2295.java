@java.lang.Override
public double nextGaussian() {
    org.nd4j.linalg.jcublas.buffer.JCudaBuffer buffer = new org.nd4j.linalg.jcublas.buffer.CudaDoubleDataBuffer(2);
    curandGenerateUniformDouble(generator, buffer.pointer(), 2);
    double[] data = buffer.asDouble();
    buffer.destroy();
    return data[0];
}