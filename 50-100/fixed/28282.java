public double getPathLength(int[] perm) {
    double distance = 0.0;
    int count = 0;
    for (int i = 0; i < ((perm.length) - 2); i++) {
        distance += edges[perm[count]][perm[(count + 1)]];
        count++;
    }
    distance += edges[(count + 1)][0];
    return distance;
}