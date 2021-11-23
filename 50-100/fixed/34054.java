private java.lang.String readContent(java.lang.String[] inputList) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    for (int i = 1; i < (inputList.length); i++) {
        sb.append(inputList[i]);
        sb.append(" ");
    }
    return sb.toString().trim();
}