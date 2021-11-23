@Test
public void MedianofTwoSortedArraysTestbythree() throws java.lang.Exception {
    MedianofTwoSortedArrays test = new MedianofTwoSortedArrays();
    int[] num1 = new int[]{ 0 , 1 , 2 };
    int[] num2 = new int[]{ 3 , 4 , 5 };
    org.junit.Assert.assertEquals(111.0, test.findMedianSortedArrays(num1, num2), 1.0);
}