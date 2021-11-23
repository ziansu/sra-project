private boolean checkUnit(int[] unit) {
    int[] target = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
    int[] unitvalues = new int[9];
    for (int index = 0; index < 9; index++) {
        unitvalues[index] = unit[index];
    }
    java.util.Arrays.sort(unitvalues);
    return java.util.Arrays.equals(unitvalues, target);
}