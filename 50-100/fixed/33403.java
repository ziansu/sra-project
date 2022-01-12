public void play(minesweeper.Viewer viewer) {
    minesweeper.io.InputParser pars = new minesweeper.io.InputParser();
    while (!(fieldEnded())) {
        this.print(viewer);
        java.lang.System.out.println("DO YOUR WORST");
        this.exploreCell(pars.read());
    } 
    this.print(viewer);
    java.lang.System.out.println("You Won");
}