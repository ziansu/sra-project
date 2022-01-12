public <T> T[] randomPortion(T[] data, int count) {
    T[] array = java.util.Arrays.copyOf(data, java.lang.Math.min(count, data.length));
    shuffle(data, array);
    return array;
}