public boolean canHeal() {
    if (mHost) {
        return (mValue) > 0;
    }
    return (((mHeavyWounds) <= (mValue)) && ((mValue) > 0)) && ((mCost.getValue()) > 0);
}