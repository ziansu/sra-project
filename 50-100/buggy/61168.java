public void testCoercionSubstitution_booleanResult1() {
    this.mode = TypeInferenceMode.BOTH;
    test("var x = {}; var y = x == null;", "var x = {}; var y = !x;");
    testSame("var x = {}; var y = x !== null;");
    testSame("var x = undefined; var y = x !== null;");
    testSame("var x = {}; var y = x === null;");
    testSame("var x = undefined; var y = x === null;");
    test("var x = 1; var y = x != 0;", "var x = 1; var y = !!x;");
    test("var x = 1; var y = x == 0;", "var x = 1; var y = !x;");
    test("var x = 1; var y = x !== 0;", "var x = 1; var y = !!x;");
    test("var x = 1; var y = x === 0;", "var x = 1; var y = !x;");
}