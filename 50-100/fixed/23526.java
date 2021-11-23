protected dna.updates.generators.BatchGenerator getNext() {
    int sum = 0;
    for (dna.updates.generators.util.BatchRepetition.BatchRepetitionWrapper bg : this.bgs) {
        sum += bg.getCount();
        if (sum > (this.index)) {
            return bg.getBg();
        }
    }
    return null;
}