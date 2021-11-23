public void testAnonymous1() {
    test("(function(){var a=10;(function(){var b=a;a++;alert(b)})()})();", ("{var a$$inline_2=10;" + ("{var b$$inline_0=a$$inline_2;" + "a$$inline_2++;alert(b$$inline_0)}}")));
}