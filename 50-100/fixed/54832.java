@org.testng.annotations.Test
public void testInitByResource() throws java.io.IOException {
    net.orzo.scripting.SourceCode src = net.orzo.scripting.SourceCode.fromResource("net/orzo/scripting/calculation.js");
    org.testng.Assert.assertEquals(src.getContents().trim().replaceAll("\\s+", " "), "(function(scope) { 'use strict'; scope.x1 = 100; scope.x2 = 12; scope.multiply = function (a, b) { return a + b; } }(this));");
    org.testng.Assert.assertEquals(src.getName(), "calculation.js");
}