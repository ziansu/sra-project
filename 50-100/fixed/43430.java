public void edgeCheck() {
    if ((V) == 1) {
        return ;
    }
    for (int w = 0; w < ((V) - 1); w++) {
        if ((computeDistance(w, ((V) - 1))) <= (DISTANCE_THRESHOLD)) {
            this.addEdge(w, ((V) - 1));
        }
    }
}