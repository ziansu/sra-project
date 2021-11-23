public void testMedian(int[] nums1, int[] nums2, double expected) {
    double median = findMedianSortedArrays(nums1, nums2);
    if (((median - expected) >= 0.001) || ((median - expected) >= 0.001)) {
        java.lang.System.out.print(java.util.Arrays.toString(nums1));
        java.lang.System.out.println(java.util.Arrays.toString(nums2));
        java.lang.System.out.println(((("median: " + median) + "; expected: ") + expected));
    }
}