@org.junit.Test
public void convertTime() {
    final double delta = 1.0E-7;
    org.junit.Assert.assertEquals(0.5, org.apache.poi.hssf.usermodel.HSSFDateUtil.convertTime("12:00"), delta);
    org.junit.Assert.assertEquals((2.0 / 3), org.apache.poi.hssf.usermodel.HSSFDateUtil.convertTime("16:00"), delta);
    org.junit.Assert.assertEquals(1.16E-5, org.apache.poi.hssf.usermodel.HSSFDateUtil.convertTime("0:00:01"), delta);
    org.junit.Assert.assertEquals(0.733044, org.apache.poi.hssf.usermodel.HSSFDateUtil.convertTime("17:35:35"), delta);
}