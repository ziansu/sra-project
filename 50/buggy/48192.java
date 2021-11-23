public void testLessthan150years() {
    inputfile = "My-Family-13-Sep-2017-897.ged";
    Methods.LessThan150YearsOld();
    assertEquals(true, Methods.testFor150);
}