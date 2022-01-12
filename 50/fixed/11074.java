@org.junit.Test
public void convertDateTime() {
    java.util.Date actual = org.apache.poi.hssf.usermodel.HSSFDateUtil.getJavaDate(30000.7);
    java.util.Date expected = org.apache.poi.hssf.usermodel.TestHSSFDateUtil.createDate(1982, 1, 18, 16, 48, 0);
    assertEquals(expected, actual);
}