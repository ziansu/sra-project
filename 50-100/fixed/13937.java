@org.junit.Test
public void sequeantialSearchIterative() {
    int[] v = new int[]{ 10 , 3 , 9 , 109 , 89 , 1 , 2 , 6 , 2 };
    int x = 109;
    int result = topics.divideconquer.SequentialSearchTest.search.sequentialSearch1(v, x);
    org.junit.Assert.assertEquals(3, result);
}