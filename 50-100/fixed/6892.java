@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        if (((mCardNumber) != null) && ((mCardNumber.length()) > 12)) {
            if ((mType) == (com.vinaygaba.creditcardview.CardType.AUTO)) {
                mCardTypeView.setBackgroundResource(getLogo());
            }
            mCardNumberView.setText(getFormattedCardNumber(addSpaceToCardNumber()));
        }
    }
}