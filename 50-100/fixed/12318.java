private static void interpretAsName(java.util.ArrayList<com.equinox.KeyParamPair> keyParamPairs, com.equinox.KeyParamPair currentPair) {
    java.lang.String newName;
    int currentIndex = keyParamPairs.indexOf(currentPair);
    newName = com.equinox.Parser.appendParameters(keyParamPairs, 0, currentIndex);
    keyParamPairs.get(0).setParam(newName);
}