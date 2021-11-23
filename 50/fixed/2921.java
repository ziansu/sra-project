public double getAverageSizeInKb() {
    if ((size) == 0) {
        return 0;
    }
    return roundTwoDecimals(((totalSizeInKB) / (size)));
}