@org.testng.annotations.Test
public void testCompareCellsDESC() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    org.testng.Assert.assertEquals(compareCell(OrderDirection.DESC, true, false), 1);
}