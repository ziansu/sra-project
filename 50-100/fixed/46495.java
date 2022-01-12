private static <T> T[] concat(T[] first, T[] second) {
    T[] result = java.util.Arrays.copyOf(first, ((first.length) + (second.length)));
    java.lang.System.arraycopy(second, 0, result, first.length, second.length);
    return result;
}