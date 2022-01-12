public static int mapElementsSizes(java.util.stream.IntStream intStream) {
    java.util.OptionalInt n = intStream.reduce(( a, b) -> a == (-1) ? -1 : b == 1 ? a : a == b ? a : -1);
    return n.isPresent() ? n.getAsInt() : 1;
}