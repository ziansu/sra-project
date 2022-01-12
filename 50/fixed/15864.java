java.lang.String getHeaderKey(int colNum) {
    if ((colNum < 0) || (colNum >= (header_keys.length)))
        return null;
    
    return header_keys[colNum];
}