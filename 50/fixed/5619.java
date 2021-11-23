@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if ((cardExpirationCal) != null) {
        for (ve.com.abicelis.creditcardexpensemanager.model.CreditCard c : mCreditCardList) {
            c.setCardExpiration(cardExpirationCal);
        }
        mAdapter.notifyDataSetChanged();
    }
}