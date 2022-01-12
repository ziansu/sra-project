public void recalculateTotalReqs() {
    for (java.lang.Integer i = 0; i < (getNoNodes()); i++) {
        for (java.lang.Integer j = 0; j < (getNoNodes()); j++) {
            total_requirement += req[i][j];
            mm_total_requirement += mm_req[i][j];
        }
    }
}