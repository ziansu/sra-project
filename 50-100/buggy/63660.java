private java.lang.String getModelStr(javax.servlet.http.HttpServletRequest request) throws java.io.UnsupportedEncodingException, javax.xml.transform.TransformerException, javax.xml.transform.TransformerFactoryConfigurationError {
    org.smap.server.utilities.GetXForm xForm = new org.smap.server.utilities.GetXForm();
    java.lang.String model = xForm.get(template, true, true, true);
    int modelIdx = model.indexOf("<model>");
    model = model.substring(modelIdx);
    model = model.replace("\n", "");
    model = model.replace("\r", "");
    return model;
}