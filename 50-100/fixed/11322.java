public void testInsideConstructor() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.String[][]> resultsMap = new java.util.HashMap<>();
    resultsMap.put("aMethod(c)", new java.lang.String[][]{ new java.lang.String[]{ "charX" , "charY" , "inCall" } });
    resultsMap.put("aMethod(c, x)", new java.lang.String[][]{ new java.lang.String[]{ "charX" , "charY" , "inCall" } , new java.lang.String[]{ "charX" , "charY" , "inCall" } });
    assertParametersGuesses(resultsMap);
}