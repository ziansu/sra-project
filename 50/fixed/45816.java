public void testTernaryUMDWrapper() {
    testModules("test.js", com.google.javascript.jscomp.LINE_JOINER.join("var foobar = {foo: 'bar'};", "typeof module === 'object' && module.exports ? module.exports = foobar :", "typeof define === 'function' && define.amd ? define([], function() {return foobar;}) :", "this.foobar = foobar;"), "var module$test = {foo: 'bar'};");
}