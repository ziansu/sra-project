@org.testng.annotations.Test
public void testCompareCellsASCNumberEQ() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    org.testng.Assert.assertEquals(compareCell(OrderDirection.DESC, 1, 1), 0);
}