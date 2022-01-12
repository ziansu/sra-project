private void concatToData(java.lang.String line, int dataIndice) {
    java.lang.String temp = data.getData().get(dataIndice);
    temp = (temp + ",") + line;
    data.getData().set(dataIndice, temp);
}