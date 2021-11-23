public static void shell(int[] ints) {
    for (int gap : pearls.sort.ShellSort.gaps) {
        pearls.sort.ShellSort.gapInsertionSort(ints, gap);
    }
}