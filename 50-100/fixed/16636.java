@org.junit.Test
public void testLink() {
    java.lang.String expression = "ERR: CoordinatesDetectionTest.hx:22(by.rovar.iso.model.CoordinatesDetectionTest.test2x2) - expected true but was false";
    com.intellij.plugins.haxe.tests.runner.filters.ErrorFilter filter = createFilter();
    java.lang.String fileName = "by/rovar/iso/model/CoordinatesDetectionTest.hx";
    com.intellij.execution.filters.Filter.Result result = filter.applyFilter(expression, expression.length());
    org.junit.Assert.assertEquals("ERR: ".length(), result.highlightStartOffset);
    org.junit.Assert.assertEquals("ERR: CoordinatesDetectionTest.hx:22".length(), result.highlightEndOffset);
    com.intellij.plugins.haxe.tests.filters.ErrorFilterTest.HLInfo info = ((com.intellij.plugins.haxe.tests.filters.ErrorFilterTest.HLInfo) (result.hyperlinkInfo));
    info.checkInfo(fileName, (22 - 1));
}