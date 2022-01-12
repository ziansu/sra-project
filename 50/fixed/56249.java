public int startSowing() {
    int seedsToSow = this.numSeeds;
    StdOut.println((("Sowing " + seedsToSow) + " seeds."));
    this.numSeeds = 0;
    return this.nextPit.sowSeed(seedsToSow);
}