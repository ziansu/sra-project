public int compare(com.schlock.website.entities.apps.notfibbage.NotFibbagePlayer p1, com.schlock.website.entities.apps.notfibbage.NotFibbagePlayer p2) {
    if ((p1.getScore()) < (p2.getScore())) {
        return 1;
    }
    if ((p1.getScore()) > (p2.getScore())) {
        return -1;
    }
    return p1.getName().compareToIgnoreCase(p2.getName());
}