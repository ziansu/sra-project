@org.junit.Test
public void testLowestHighIndexTwoToFour() {
    double[] values = new double[]{ 13.3 , 19.9 , 10 , 21 , 7.7 };
    com.jasonlam604.stocktechnicals.util.LowestLow lowestLow = new com.jasonlam604.stocktechnicals.util.LowestLow();
    lowestLow.find(values, 2, 2);
    org.junit.Assert.assertEquals(10.0, lowestLow.getValue(), 0);
    org.junit.Assert.assertEquals(2, lowestLow.getIndex(), 0);
}