public void hurt(final int aValue, final boolean aHeavy) {
    mValue += aValue;
    if ((mValue) >= (mSteps.length)) {
        mValue = (mSteps.length) - 1;
    }
    if (aHeavy) {
        mHeavyWounds += aValue;
        if ((mHeavyWounds) > (mValue)) {
            mHeavyWounds = mValue;
        }
        mChangeListener.sendChange(new com.deepercreeper.vampireapp.host.change.HealthChange(true, mHeavyWounds));
    }
    mChangeListener.sendChange(new com.deepercreeper.vampireapp.host.change.HealthChange(false, mValue));
    updateValue();
}