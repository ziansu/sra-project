private java.lang.String getLastPartOfHeader(java.lang.String shibHeader) {
    java.lang.String header = request.getHeader(shibHeader);
    java.lang.String[] splittedHeader = header.split("[:]");
    if ((splittedHeader.length) < 1)
        return null;
    else
        return splittedHeader[((splittedHeader.length) - 1)];
    
}