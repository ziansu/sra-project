public static java.util.stream.LongStream mkStream(long offset, long n) {
    return java.util.stream.Stream.iterate(offset, ( i) -> i + 1).mapToLong(github.com.beenotung.javalib.Utils::id).limit(n);
}