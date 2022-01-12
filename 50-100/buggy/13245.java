@java.lang.Override
public void compoundDNA() {
    int split = brain.getNumberOfNeededGenes();
    brain.compoundDNA(this.dna.getSequence(0, split));
    body.compoundDNA(this.dna.getSequence((split + 1), body.getNumberOfNeededGenes()));
}