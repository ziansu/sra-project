protected java.lang.String hashFile(java.io.File file) {
    if ((stateGenerator.getParameters().getCompareMode()) == (org.fim.model.CompareMode.FAST)) {
        return StateGenerator.NO_HASH;
    }
    try {
        if ((file.length()) < (StateGenerator.SIZE_50_MO)) {
            return hashFileUsingNIO(file);
        }else {
            return hashFileChunkByChunk(file);
        }
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException("Exception occurred during file hashing", ex);
    }
}