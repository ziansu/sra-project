@org.junit.Test
public void putAQuarterAtTheEnd() throws java.lang.Exception {
    int[] coins = new int[]{ 1 , 5 , 10 , 25 };
    org.junit.Assert.assertEquals(25, coins[3]);
}