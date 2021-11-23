public boolean nextKeyValue() throws java.io.IOException {
    if ((planeIdx) >= (nPlanes)) {
        value = null;
        return false;
    }
    try {
        value = factory.build(java.lang.String.format("%s_%d", name, seriesIdx), planeIdx);
    } catch (loci.formats.FormatException e) {
        throw new java.lang.RuntimeException(("FormatException: " + (e.getMessage())));
    }
    (planeIdx)++;
    return true;
}