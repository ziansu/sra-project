@org.junit.Test
public void bug54557() throws java.lang.Exception {
    final java.lang.String format = ".0000";
    boolean isDateFormat = org.apache.poi.hssf.usermodel.HSSFDateUtil.isADateFormat(165, format);
    org.junit.Assert.assertEquals(false, isDateFormat);
}