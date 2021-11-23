private void resetFrame() {
    this.getContentPane().removeAll();
    this.puzzleFile = null;
    this.puzzleFileName = null;
    this.size = 0;
    this.cageCells = null;
    this.numberOfCages = 0;
    this.cageObjectives = null;
    this.c = null;
    this.setTitle("Calcudoku");
    this.validate();
    this.revalidate();
    this.pack();
    this.setLocationRelativeTo(null);
}