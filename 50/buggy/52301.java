public void onTraversalDone(org.broadinstitute.sting.gatk.walkers.ClipReadsWalker.ClippingData data) {
    out.printf(data.toString());
}