java.util.List<org.xtreemfs.foundation.intervals.Interval> getCommitStripeIntervals(org.xtreemfs.foundation.intervals.Interval stripeInterval) {
    java.util.List<org.xtreemfs.foundation.intervals.Interval> commitStripeInterval = commitVector.getSlice(stripeInterval.getStart(), stripeInterval.getEnd());
    while (commitStripeInterval.get(((commitStripeInterval.size()) - 1)).isEmpty()) {
        commitStripeInterval.remove(((commitStripeInterval.size()) - 1));
    } 
    return commitStripeInterval;
}