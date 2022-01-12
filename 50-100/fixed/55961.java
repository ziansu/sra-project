public boolean equals(kmeans.Point other) {
    boolean match = true;
    for (int i = 0; i < (dimension); i++) {
        if ((coordinates[i]) != (other.coordinates[i])) {
            return false;
        }
    }
    return match;
}