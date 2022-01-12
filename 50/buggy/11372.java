@org.testng.annotations.Test
public void testCompareCellsDESC() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    assertEquals(compareCell(OrderDirection.DESC, true, false), 1);
}