public static int[] addRandomInt(Collection.List<java.lang.Integer> myList, int numbers) {
    int actual = 0;
    int[] result = new int[numbers];
    for (int i = 0; i < numbers; i++) {
        actual = util.TestUtil.rnd.nextInt(util.TestUtil.RANDOM_BOUND);
        result[i] = actual;
        myList.add(actual);
    }
    return result;
}