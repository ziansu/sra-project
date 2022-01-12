public java.lang.String getTextBody() {
    if ((body) == null) {
        return null;
    }else
        if ((charset) != null) {
            try {
                return new java.lang.String(body, charset);
            } catch (java.io.UnsupportedEncodingException e) {
                return new java.lang.String(body);
            }
        }else {
            return new java.lang.String(body);
        }
    
}