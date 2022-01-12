public <T> T[] randomPortion(T[] data, int count) {
    T[] array = java.util.Arrays.copyOf(data, data.length);
    shuffle(data, array);
    array = java.util.Arrays.copyOf(array, java.lang.Math.min(count, data.length));
    return array;
}