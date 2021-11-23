private int findIndex(java.lang.Double sim) {
    int i = 0;
    boolean found = false;
    if ((resultSim.size()) > 0) {
        while ((!found) && (i < (resultSim.size()))) {
            if (sim >= (resultSim.get(i))) {
                found = true;
            }else {
                i++;
            }
        } 
    }
    return i;
}