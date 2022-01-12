public com.wx.servercomm.URLBuilder addParameter(java.lang.String parameterName, java.lang.String parameterValue) throws java.io.UnsupportedEncodingException {
    char separator = (firstParameterAdded) ? '&' : '?';
    addParameter(separator, parameterName, parameterValue);
    firstParameterAdded = true;
    return this;
}