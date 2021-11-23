public java.lang.String chooseImage(java.lang.String[] submitted) {
    if (submitted == null)
        return null;
    
    int length = submitted.length;
    if (length == 0) {
        return null;
    }else
        if (length >= 3) {
            return submitted[(length - 1)];
        }else {
            return submitted[0];
        }
    
}