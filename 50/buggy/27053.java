@org.testng.annotations.Test
public void testCompareCellsDESCCase2() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    assertEquals(compareCell(OrderDirection.DESC, false, true), (-1));
}