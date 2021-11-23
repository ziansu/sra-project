@org.testng.annotations.Test
public void testCompareCellsASCNumber() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    org.testng.Assert.assertEquals(compareCell(OrderDirection.ASC, 1, 2), 1);
}