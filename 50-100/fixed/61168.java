public void testCoercionSubstitution_booleanResult1() {
    this.mode = TypeInferenceMode.BOTH;
    test("var x = {}; var y = x == null;", "var x = {}; var y = !x;");
    testSame("var x = {}; var y = x !== null;");
    testSame("var x = undefined; var y = x !== null;");
    testSame("var x = {}; var y = x === null;");
    testSame("var x = undefined; var y = x === null;");
    testSame("var x = 1; var y = x != 0;");
    testSame("var x = 1; var y = x == 0;");
    testSame("var x = 1; var y = x !== 0;");
    testSame("var x = 1; var y = x === 0;");
}