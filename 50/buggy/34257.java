public static java.util.stream.IntStream mkStream(int offset, int n) {
    return java.util.stream.Stream.iterate(offset, ( i) -> i++).mapToInt(github.com.beenotung.javalib.Utils::id).limit(n);
}