public java.lang.Integer extractTaskNumber(java.lang.String inputLine) {
    java.lang.String[] splitInputLine = inputLine.split(" ");
    return java.lang.Integer.valueOf(splitInputLine[0]);
}