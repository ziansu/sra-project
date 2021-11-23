@org.junit.Test
public void putAFiftyCentPieceFirst() throws java.lang.Exception {
    int[] coins = new int[]{ 1 , 5 , 10 , 25 };
    coins[0] = 50;
    org.junit.Assert.assertEquals(50, coins[0]);
}