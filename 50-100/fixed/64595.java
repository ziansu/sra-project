private void grow() {
    java.lang.String[] temp = new java.lang.String[((size) * 2) + 1];
    for (int i = 0; i < ((size) - 1); i++) {
        temp[i] = data[i];
    }
    data = temp;
}