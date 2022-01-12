@org.testng.annotations.Test
public void testCompareCellsDESCNumber() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    org.testng.Assert.assertEquals(compareCell(OrderDirection.DESC, 1, 2), (-1));
}