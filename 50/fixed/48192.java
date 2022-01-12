public void testLessthan150years() {
    Methods.LessThan150YearsOld("My-Family-13-Sep-2017-897.ged");
    assertEquals(true, Methods.testFor150);
}