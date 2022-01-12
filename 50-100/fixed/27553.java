public boolean believed(int a) {
    boolean belief = false;
    for (int i = 0; i < (Gamblers.length); i++) {
        if ((hasCash(i)) && (i != a)) {
            if ((Gamblers[i].getBid()[0]) != (-1)) {
                belief = true;
            }
        }
    }
    return belief;
}