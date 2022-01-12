public org.broadinstitute.hellbender.tools.walkers.genotyper.afcalc.AFCalculationResult getLog10PNonRef(final htsjdk.variant.variantcontext.VariantContext vc, final int defaultPloidy, final int maximumAlternativeAlleles, final double[] log10AlleleFrequencyPriors) {
    org.broadinstitute.hellbender.utils.Utils.nonNull(vc, "VariantContext cannot be null");
    org.broadinstitute.hellbender.utils.Utils.nonNull(log10AlleleFrequencyPriors, "priors vector cannot be null");
    org.broadinstitute.hellbender.utils.Utils.validateArg(((vc.getNAlleles()) > 1), ("VariantContext has only a single reference allele, but getLog10PNonRef requires at least one alt allele " + vc));
    final org.broadinstitute.hellbender.tools.walkers.genotyper.afcalc.StateTracker stateTracker = getStateTracker(true, maximumAlternativeAlleles);
    return computeLog10PNonRef(vc, defaultPloidy, log10AlleleFrequencyPriors, stateTracker);
}