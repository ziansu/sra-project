protected boolean isEqualTo(de.uni_freiburg.informatik.ultimate.plugins.analysis.abstractinterpretationv2.domain.nonrelational.interval.IntervalDomainValue other) {
    if (other == null) {
        return false;
    }
    if (other == (this)) {
        return true;
    }
    if ((mIsBottom) || (other.mIsBottom)) {
        return (mIsBottom) == (other.mIsBottom);
    }
    return (mLower.equals(other.mLower)) && (mUpper.equals(other.mUpper));
}