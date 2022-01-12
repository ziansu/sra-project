@org.testng.annotations.Test
public void testCompareCellsASC() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    org.testng.Assert.assertEquals(compareCell(OrderDirection.ASC, true, false), (-1));
}