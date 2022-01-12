public java.lang.String[] valuesToArray() {
    java.lang.String[] valuesArr = new java.lang.String[size];
    if ((this.size) == 0) {
        return valuesArr;
    }
    generateValuesArray(root, valuesArr, 0);
    return valuesArr;
}