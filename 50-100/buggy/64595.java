private void grow() {
    java.lang.String[] temp = new java.lang.String[(size) * 2];
    for (int i = 0; i < (size); i++) {
        temp[i] = data[i];
    }
    data = temp;
}