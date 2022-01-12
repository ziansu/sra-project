private void populateGrid() {
    for (int h = 0; h < (grid.size()); h++) {
        for (int w = 0; w < (fieldWidth); w++) {
            grid.get(h).add(w, new Cell());
        }
    }
}