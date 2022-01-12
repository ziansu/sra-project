public static void main(java.lang.String[] args) {
    easy.MergeSortedArraySolution msas = new easy.MergeSortedArraySolution();
    int[] a = new int[]{ 0 };
    int[] b = new int[]{ 1 };
    a = new int[]{ 1 };
    b = new int[]{  };
    msas.merge(a, 1, b, 0);
    easy.Solution.printArray(a);
}