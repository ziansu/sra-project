public void loadCatalogDetailsFromFileIfRequired(boolean forceReload) {
    if (forceReload)
        mCatalogueDetails = null;
    
    try {
        if ((mCatalogueDetails) != null)
            return ;
        
        java.io.File catalogDetailsFile = getLocalCatalogDetailsFile();
        if (!(catalogDetailsFile.exists()))
            return ;
        
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        mCatalogueDetails = ((org.json.simple.JSONObject) (parser.parse(new java.io.FileReader(catalogDetailsFile))));
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}