private int premierSommetMinimum() {
    int poidsMin = infini;
    int res = -1;
    for (int i = 0; i < (d.length); i++) {
        if (!(mark[i])) {
            if (poidsMin >= (d[i])) {
                res = i;
                poidsMin = d[i];
            }
        }
    }
    return res;
}