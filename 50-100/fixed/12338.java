@java.lang.Override
public void enforce(final org.deidentifier.arx.framework.check.groupify.HashGroupifyDistribution distribution, final int numMaxSuppressedOutliers) {
    if (this.isFulfilled(distribution)) {
        return ;
    }
    distribution.suppressWhileNotFulfilledBinary(new org.deidentifier.arx.framework.check.groupify.HashGroupifyDistribution.PrivacyCondition() {
        public org.deidentifier.arx.criteria.State isFulfilled(org.deidentifier.arx.framework.check.groupify.HashGroupifyDistribution distribution) {
            boolean fulfilled = org.deidentifier.arx.criteria.RiskBasedPrivacyCriterion.this.isFulfilled(distribution);
            if ((!fulfilled) && ((distribution.getNumOfSuppressedTuples()) > numMaxSuppressedOutliers)) {
                return State.ABORT;
            }else {
                return fulfilled ? State.FULFILLED : State.NOT_FULFILLED;
            }
        }
    });
}