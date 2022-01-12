@org.junit.Test
public void testTinhTong9() {
    long n = -10000;
    long expResult = 0;
    long result = tinhtongdemo.TinhTongDemo.TinhTong(n);
    assertEquals(expResult, result);
}