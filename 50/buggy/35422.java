public int optimize(org.deidentifier.arx.DataHandle handle, double gsFactor, org.deidentifier.arx.ARXListener listener) throws org.deidentifier.arx.exceptions.RollbackRequiredException {
    return optimizeFast(handle, gsFactor, java.lang.Double.NaN, listener);
}