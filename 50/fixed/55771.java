public double mean() {
    if ((count.size()) == 0) {
        return 0;
    }
    return (sum()) / ((double) (count.size()));
}