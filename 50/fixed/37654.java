public void testAnonymous3() {
    test("(function(){var a=10;(function(){arguments;})()})();", "{var a$$inline_0=10;(function(){arguments;})();}");
    test("(function(){(function(){arguments;})()})();", "{(function(){arguments;})()}");
}