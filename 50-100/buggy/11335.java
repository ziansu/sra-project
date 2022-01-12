public void setExternalNum(java.lang.String externalNum) {
    try {
        if ((vendorName.length()) <= 50)
            this.externalNum = externalNum;
        else {
            throw new java.lang.IllegalArgumentException((("'" + externalNum) + "' is longer than 50"));
        }
    } catch (java.lang.IllegalArgumentException e) {
        errorList[5] = "ERROR: " + (e.getMessage());
        setErrorCount(((getErrorCount()) + 1));
    }
}