@org.junit.Test
public void testConvertEleven() {
    expected = "XI";
    converter.ConverterEngine converterEngine = new converter.ConverterEngine();
    actual = converterEngine.convert(11);
    java.lang.System.out.println(("ELEVEN::: Actual " + (actual)));
    java.lang.System.out.println(converterEngine.getDecimalPlaces(11));
    java.lang.System.out.println();
    assertEquals(expected, actual);
}