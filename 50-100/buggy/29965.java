private void compute() {
    for (int i = columns.size(); i <= (reducers); i++) {
        int[] best = compute(i);
        if ((compareWorkloads(best, dimensions)) < 0) {
            ch.epfl.data.squall.thetajoin.matrix_assignment.Utilities.copy(best, dimensions);
        }
    }
}