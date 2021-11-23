@org.example.Benchmark
public int reverse_uncached_bound() {
    int sum = 0;
    for (int i = items.length; i >= 0; i--) {
        sum += i;
    }
    return sum;
}