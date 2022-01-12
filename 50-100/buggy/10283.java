@com.google.common.annotations.VisibleForTesting
void checkForSplitRead(final org.broadinstitute.hellbender.utils.read.GATKRead read, final java.util.List<org.broadinstitute.hellbender.tools.spark.sv.BreakpointEvidence> evidenceList) {
    final java.util.List<htsjdk.samtools.CigarElement> cigarElements = read.getCigar().getCigarElements();
    if (org.broadinstitute.hellbender.tools.spark.sv.ReadClassifier.hasInitialSoftClip(cigarElements, read)) {
        evidenceList.add(new org.broadinstitute.hellbender.tools.spark.sv.BreakpointEvidence.SplitRead(read, readMetadata, true));
    }
    if (org.broadinstitute.hellbender.tools.spark.sv.ReadClassifier.hasFinalSoftClip(cigarElements, read)) {
        evidenceList.add(new org.broadinstitute.hellbender.tools.spark.sv.BreakpointEvidence.SplitRead(read, readMetadata, false));
    }
    checkBigIndel(cigarElements, read, evidenceList);
}