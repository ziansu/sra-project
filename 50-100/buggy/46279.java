private void test1() {
    org.jimple.planner.InputStruct testStruct = null;
    try {
        testStruct = org.jimple.planner.ParserTest.testParser.parseInput("add Learn Double Dream Hands from 12 may 8am to 13 may 12AM category DOWNDOG");
        java.lang.String[] test = testStruct.getVariableArray();
        for (java.lang.String i : test) {
            java.lang.System.out.println(i);
        }
        assertEquals(assertArray(testStruct, "event", "Learn Double Dream Hands", null, "2016-05-12T08:00", "2016-05-13T00:00", "DOWNDOG"), true);
    } catch (java.lang.Exception e) {
    }
}