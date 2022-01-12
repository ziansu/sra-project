private java.lang.String getStorage(org.talend.core.model.general.Project project) throws org.talend.utils.json.JSONException {
    if (project == null)
        return "";
    
    java.lang.String storage = "";
    if (project != null) {
        java.lang.String url = project.getEmfProject().getUrl();
        if (url == null)
            return "";
        
        org.talend.utils.json.JSONObject jsonObj = new org.talend.utils.json.JSONObject(url);
        storage = jsonObj.getString("storage");
    }
    return storage;
}