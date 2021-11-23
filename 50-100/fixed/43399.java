protected java.lang.String hashFile(java.io.File file) throws java.io.IOException {
    if ((stateGenerator.getParameters().getCompareMode()) == (org.fim.model.CompareMode.FAST)) {
        return StateGenerator.NO_HASH;
    }else
        if ((file.length()) < (StateGenerator.SIZE_50_MO)) {
            return hashFileUsingNIO(file);
        }else {
            return hashFileChunkByChunk(file);
        }
    
}