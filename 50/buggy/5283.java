public void testConstantProperty3a() {
    this.mode = TypeInferenceMode.OtiOnly;
    testSame(("/** @constructor */ function Foo() {}\n" + ("/** @type {number} */ Foo.prototype.PROP = 2;\n" + "/** @suppress {duplicate|const} */ Foo.prototype.PROP = 3;\n")));
}