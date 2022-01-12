@org.example.Benchmark
public int reverse_cached_bound() {
    int sum = 0;
    final int len = items.length;
    for (int i = len - 1; i >= 0; i--) {
        sum += i;
    }
    return sum;
}