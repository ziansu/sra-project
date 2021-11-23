@java.lang.Override
public void setValue(long amount) {
    if (!(isInEditMode())) {
        if ((oldAmount) != amount) {
            oldAmount = amount;
            super.setValue(amount);
            if ((mOnValueChangeListener) != null) {
                mOnValueChangeListener.onLongValueChanged(this, amount, mIndex);
            }
            initialValue = amount / (de.aw.awlib.database.AWDBConvert.mCurrencyDigits);
        }
    }
}