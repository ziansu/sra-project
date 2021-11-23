public void defaultArray(java.lang.String defaultVal) throws java.lang.Exception {
    this.defaultVal = defaultVal;
    for (int i = 0; i < (this.val.size()); i++)
        this.val.add(i, this.defaultVal);
    
}