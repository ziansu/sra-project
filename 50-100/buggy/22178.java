public int[] calcul(int arg) {
    int a = arg - 1;
    d[a] = 0;
    while (nonMarque()) {
        a = premierSommetMinimum();
        mark[a] = true;
        for (int b = 1; b <= (g.getNbSommet()); b++) {
            relachement(a, b);
        }
    } 
    return d;
}