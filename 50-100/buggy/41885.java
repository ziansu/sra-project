public static void main(java.lang.String[] args) {
    easy.MergeSortedArraySolution msas = new easy.MergeSortedArraySolution();
    int[] a = new int[]{ 0 };
    int[] b = new int[]{ 1 };
    msas.merge(a, 0, b, 1);
    easy.Solution.printArray(a);
}