private edu.ksu.operatingsystems.javaos.util.Pair<java.lang.Integer, java.lang.String> readFromRight(java.lang.String readFrom, int numberOfCharacters) {
    java.lang.Integer value = java.lang.Integer.parseInt(readFrom.substring(0, numberOfCharacters), 2);
    java.lang.String result = readFrom.substring(numberOfCharacters);
    return new edu.ksu.operatingsystems.javaos.util.Pair<java.lang.Integer, java.lang.String>(value, result);
}