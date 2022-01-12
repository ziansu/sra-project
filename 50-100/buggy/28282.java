public double getPathLength(DirectionalElement[] perm) {
    double distance = 0.0;
    int count = 0;
    for (int i = 0; i < ((perm.length) - 2); i++) {
        distance += edges[perm[count].index][perm[(count + 1)].index];
        count++;
    }
    distance += edges[(count + 1)][0];
    return distance;
}