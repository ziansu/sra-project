public java.lang.String[] getListCreatureDetails() {
    java.lang.String[] output = new java.lang.String[getNextEmpty()];
    for (int i = 0; i < (getNextEmpty()); i++) {
        output[i] = store[i].getDetails();
    }
    return output;
}