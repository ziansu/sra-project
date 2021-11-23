@org.junit.Test
public void test() {
    org.junit.Assert.assertTrue(verifyPreorder(new int[]{ 4 , 1 , 3 , 2 , 9 , 6 , 5 , 8 , 7 , 10 , 11 }));
    org.junit.Assert.assertFalse(verifyPreorder(new int[]{ 4 , 5 , 3 , 2 , 9 , 6 , 1 , 8 , 7 , 10 , 11 }));
}