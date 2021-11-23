@java.lang.Override
public void finish() {
    org.broad.igv.feature.genome.Genome genome = org.broad.igv.feature.genome.GenomeManager.getInstance().getCurrentGenome();
    for (org.broad.igv.sam.AlignmentBlock block : alignmentBlocks) {
        block.reduce(genome);
    }
}