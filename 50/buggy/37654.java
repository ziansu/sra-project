public void testAnonymous3() {
    assumeMinimumCapture = false;
    testSame("(function(){var a=10;(function(){arguments;})()})();");
    assumeMinimumCapture = true;
    test("(function(){var a=10;(function(){arguments;})()})();", "{var a$$inline_0=10;(function(){arguments;})();}");
    test("(function(){(function(){arguments;})()})();", "{(function(){arguments;})()}");
}