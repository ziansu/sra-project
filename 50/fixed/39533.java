public java.lang.String[] GetKeysByOrder(java.lang.String fName, java.lang.String section, java.lang.String order) {
    return this.GetKeysByOrder(fName, section, order, java.lang.String.valueOf(java.lang.Integer.MAX_VALUE), "0");
}