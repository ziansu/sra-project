public double getFinalSalary() {
    if (!(this.mTotalSalaryCaculated)) {
        mSalary = fi.solinor.assignment.monthlywagecalculationsystem.Utils.removeValueAfterDot(mSalary, 2);
        this.mTotalSalaryCaculated = true;
    }
    return mSalary;
}