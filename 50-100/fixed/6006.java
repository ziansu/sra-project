private void generateBriefcase() {
    boolean briefcaseset = false;
    while (!briefcaseset) {
        int r = rand.nextInt(9);
        int s = rand.nextInt(9);
        if (board.getTile(r, s).isRoom()) {
            board.getTile(r, s).setBriefcase();
            briefcaseset = true;
        }
    } 
}