@org.junit.Test
public void testTinhTong4() {
    long n = 100;
    long expResult = 2550;
    long result = tinhtongdemo.TinhTongDemo.TinhTong(n);
    assertEquals(expResult, result);
}