public java.lang.String getFormPreviewURL(java.lang.String crfOID) throws java.lang.Exception {
    java.net.URL eURL = new java.net.URL(((enketoURL) + "/api/v1/survey/preview"));
    org.akaza.openclinica.web.pform.EnketoURLResponse response = getURL(eURL, crfOID);
    if (response != null)
        return response.getPreview_url();
    else
        return "";
    
}