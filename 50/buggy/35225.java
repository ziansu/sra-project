@org.testng.annotations.Test
public void testCompareCellsASCCase2() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    assertEquals(compareCell(OrderDirection.ASC, false, true), 1);
}