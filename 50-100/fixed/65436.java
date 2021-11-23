public int[] generate() {
    int[] result = new int[6];
    for (int i = 0; i < 6; i++) {
        result[i] = (random.nextInt(45)) + 1;
    }
    return result;
}