public java.lang.String chooseImage(java.lang.String[] submitted) {
    java.lang.String result = null;
    if (submitted == null)
        return null;
    
    int length = submitted.length;
    if (length == 0) {
        return result;
    }else
        if (length > 3) {
            return submitted[(length - 1)];
        }else {
            return submitted[0];
        }
    
}