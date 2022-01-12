public int[] getHighestFreq(int amount) {
    int[] out = new int[amount];
    for (int x = 0; x < amount; x++) {
        int highest = 0;
        for (int y = 0; y < (Input.number_nodes); y++) {
            if ((frequence[y]) > (frequence[highest])) {
                highest = y;
            }
        }
        out[x] = highest;
        frequence[highest] = 0;
    }
    return out;
}