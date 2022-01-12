public void testReportUknownTypes() {
    this.reportUnknownTypes = true;
    typeCheck("var x = globalvar;", NewTypeInference.UNKNOWN_EXPR_TYPE);
    typeCheck("function f(/** ? */ x) { return x; }", NewTypeInference.UNKNOWN_EXPR_TYPE);
    typeCheck("var x = ({})['asdf'];", NewTypeInference.UNKNOWN_EXPR_TYPE);
    typeCheck(com.google.javascript.jscomp.LINE_JOINER.join("function f(/** !Object */ x) {", "  x['prop' + 'asdf'] = 123;", "}"));
    typeCheck(com.google.javascript.jscomp.LINE_JOINER.join("function f(/** !Object */ x) {", "  x['asdf'] = 123;", "}"), NewTypeInference.UNKNOWN_EXPR_TYPE);
    typeCheck(com.google.javascript.jscomp.LINE_JOINER.join("/** @struct @constructor */", "var Foo = function() {};", "/**", " * @struct", " * @constructor", " * @extends {Foo}", " */", "var Bar = function() {", "  Foo.call(this);", "};"));
}