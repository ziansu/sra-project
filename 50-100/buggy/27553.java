public boolean believed(int a) {
    boolean belief = false;
    for (int i = 0; i < (Gamblers.length); i++) {
        if (i != a) {
            if (((Gamblers[i].getBid()[0]) != (-1)) && (hasCash(i))) {
                belief = true;
            }
        }
    }
    return belief;
}