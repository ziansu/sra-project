@java.lang.Override
public void onDialogNumberSet(int reference, java.math.BigInteger number, double decimal, boolean isNegative, java.math.BigDecimal fullNumber) {
    mNumbers.set(reference, number);
    notifyDataSetChanged();
}