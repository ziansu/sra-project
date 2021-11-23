@java.lang.Override
public int calculateFitness(java.util.BitSet b) {
    int result = 0;
    for (int i = 0; i < (b.length()); i++) {
        if (b.get(i)) {
            result += i;
        }
    }
    return result;
}