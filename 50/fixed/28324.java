@org.junit.Test
public void testConvertExtremes() {
    expected = "X";
    converterEngine = new converter.ConverterEngine(10);
    actual = converterEngine.convert(10);
    java.lang.System.out.println(("EXTREMES::: Actual " + (actual)));
    assertEquals(expected, actual);
}