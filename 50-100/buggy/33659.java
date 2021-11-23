@java.lang.Override
public java.lang.String[] getOptimalContainerParams(byte[] message) {
    int blocks = (message.length) * 4;
    int dim = ((int) (java.lang.Math.sqrt(blocks)));
    dim += r.nextInt(dim);
    return new java.lang.String[]{ java.lang.String.valueOf(dim) , java.lang.String.valueOf((((blocks / dim) + ((blocks * 4) % dim)) + (r.nextInt(dim)))) };
}