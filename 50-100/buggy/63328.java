public com.erbis.java.courses.algorithms.sort.SortStat sortWeights(com.erbis.java.courses.algorithms.sort.Dog[] dogs) {
    int[] arrayToSort = new int[dogs.length];
    for (int index = 0; index < (dogs.length); index++) {
        arrayToSort[index] = dogs[index].getWeight();
    }
    com.erbis.java.courses.algorithms.sort.ShellSort sort = new com.erbis.java.courses.algorithms.sort.ShellSort();
    sort(arrayToSort);
    com.erbis.java.courses.algorithms.sort.SortStat stats = new com.erbis.java.courses.algorithms.sort.SortStat();
    return stats;
}