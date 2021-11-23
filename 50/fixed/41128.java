@java.lang.Override
public double log10EmissionProbability(final java.lang.Double data, final org.broadinstitute.hellbender.utils.hmm.CopyNumberTriState state) {
    final org.apache.commons.math3.distribution.NormalDistribution distribution = stateDistribution(org.broadinstitute.hellbender.utils.Utils.nonNull(state));
    return distribution.density(data);
}