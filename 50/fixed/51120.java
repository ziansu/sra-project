@java.lang.Override
public double log10PriorProbability(final org.broadinstitute.hellbender.utils.hmm.CopyNumberTriState state) {
    org.broadinstitute.hellbender.utils.Utils.nonNull(state);
    return state == (CopyNumberTriState.NEUTRAL) ? log10OneMinus2P : log10P;
}