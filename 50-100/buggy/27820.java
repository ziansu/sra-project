private static long removeLeadingDigit(int size) {
    long value = 0;
    for (int i = 1; i <= (size - 1); i++) {
        value = ((algorithms.RabinKarpSubstringSearch.R) * value) % (algorithms.RabinKarpSubstringSearch.Q);
    }
    return value;
}