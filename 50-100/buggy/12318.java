private static void interpretAsName(java.util.ArrayList<com.equinox.KeyParamPair> keyParamPairs, com.equinox.KeyParamPair currentPair) {
    int currentIndex = keyParamPairs.indexOf(currentPair);
    java.lang.String newName = com.equinox.Parser.appendParameters(keyParamPairs, 0, currentIndex);
    keyParamPairs.get(0).setParam(newName);
}