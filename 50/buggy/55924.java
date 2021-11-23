@org.junit.Test
public void testTinhTong4() {
    int n = 100;
    int expResult = 2550;
    int result = tinhtongdemo.TinhTongDemo.TinhTong(n);
    assertEquals(expResult, result);
}