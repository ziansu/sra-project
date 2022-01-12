public void shuffleArray(int[] arr) {
    java.util.Random rnd = new java.util.Random();
    for (int i = (arr.length) - 1; i > 0; i--) {
        int index = rnd.nextInt((i + 1));
        int blah = arr[index];
        arr[index] = arr[i];
        arr[i] = blah;
    }
}