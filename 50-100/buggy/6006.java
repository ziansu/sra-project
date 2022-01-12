private void generateBriefcase() {
    boolean briefcaseset = false;
    while (!briefcaseset) {
        int r = rand.nextInt(9);
        int s = rand.nextInt(9);
        if (board.getTile(r, s).isRoom()) {
            board.getTile(r, s).setBriefcase();
            java.lang.System.out.println(((("\nBriefcase placed at \n" + r) + " ") + s));
            briefcaseset = true;
        }
    } 
}