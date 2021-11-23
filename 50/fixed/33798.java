public void testMethodInference6() throws java.lang.Exception {
    testTypes(("/** @constructor */ function F() {}" + (((("/** @param {number} x */ F.prototype.foo = function(x) { };" + "/** @constructor \n * @extends {F} */ ") + "function G() {}") + "/** @override */ G.prototype.foo = function() { };") + "(new G()).foo(1);")));
}