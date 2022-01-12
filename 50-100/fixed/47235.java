@org.junit.Test
public void test() {
    org.junit.Assert.assertTrue(verifyPreorder(new int[]{ 4 , 2 , 3 , 6 , 5 }));
    org.junit.Assert.assertFalse(verifyPreorder(new int[]{ 4 , 2 , 6 , 5 , 3 }));
    org.junit.Assert.assertFalse(verifyPreorder(new int[]{ 4 , 5 , 3 , 2 , 9 , 6 , 1 , 8 , 7 , 10 , 11 }));
}