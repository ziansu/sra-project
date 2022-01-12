@Test
public void MedianofTwoSortedArraysTestbythree() throws java.lang.Exception {
    MedianofTwoSortedArrays test = new MedianofTwoSortedArrays();
    int[] num1 = new int[]{ 1 };
    int[] num2 = new int[]{ 1 };
    org.junit.Assert.assertEquals(1.0, test.findMedianSortedArrays(num1, num2), 1.0);
}