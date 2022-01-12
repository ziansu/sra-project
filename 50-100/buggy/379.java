@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        if ((mCardNumber.length()) > 12) {
            cardNumber.setText(checkCardNumberFormat(addSpaceToCardNumber(mCardNumber)));
            if ((mType) == (com.vinaygaba.creditcardview.CardType.AUTO)) {
                type.setBackgroundResource(getLogo(mType));
            }
        }
    }
}