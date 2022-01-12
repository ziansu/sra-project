public void init(double d, int t, int sideLength) {
    gen = new java.util.Random();
    this.d = d;
    this.t = t;
    this.turn = 0;
    this.diameter = 0;
    this.initialCells = 0;
    this.determine = true;
    this.movesPerSide = t / 4;
    this.totalOfSides = (movesPerSide) * 4;
    this.squaring = true;
}