private java.lang.String inferBodyType() {
    if ((file) != null)
        return org.mariotaku.restfu.http.BodyType.RAW;
    
    for (org.mariotaku.restfu.Pair<java.lang.String, org.mariotaku.restfu.http.mime.Body> pair : getParams().toList()) {
        if (!((pair.second) instanceof org.mariotaku.restfu.http.mime.StringBody))
            return org.mariotaku.restfu.http.BodyType.MULTIPART;
        
    }
    return org.mariotaku.restfu.http.BodyType.FORM;
}