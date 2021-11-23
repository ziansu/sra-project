public void setDesiredAcceleration(org.ejml.data.DenseMatrix64F qdd, int[] indices) {
    if ((indices.length) != 6)
        throw new java.lang.RuntimeException(("Unexpected number of indices: " + (java.util.Arrays.toString(indices))));
    
    desiredAcceleration.reshape(6, 0);
    for (int i = 0; i < (indices.length); i++)
        desiredAcceleration.set(i, 0, qdd.get(indices[i], 0));
    
}