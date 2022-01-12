private static int recursive(int n) {
    if (n == 0) {
        (Sequence.efficiency)++;
        return 0;
    }else
        if (n == 1) {
            (Sequence.efficiency)++;
            return 1;
        }
    
    return (2 * (Sequence.recursive((n - 1)))) + (Sequence.recursive((n - 2)));
}