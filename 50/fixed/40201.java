public int toStringHelper(java.lang.String rep) {
    int iterations = 0;
    for (@java.lang.SuppressWarnings(value = "unused")
    logic.Post p : posts) {
        iterations++;
    }
    return iterations;
}