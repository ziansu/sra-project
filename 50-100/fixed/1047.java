public void prefetchStructure(java.lang.String pdbId) throws java.io.IOException {
    if ((pdbId.length()) < 4)
        throw new java.io.IOException(("The provided ID does not look like a PDB ID : " + pdbId));
    
    java.io.File file = downloadStructure(pdbId);
    if (!(file.exists())) {
        throw new java.io.IOException((("Structure " + pdbId) + " not found and unable to download."));
    }
}