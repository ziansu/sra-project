@java.lang.Override
public int getNumberOfNeededGenes() {
    return (this.brain.getNumberOfNeededGenes()) + (this.body.getNumberOfNeededGenes());
}