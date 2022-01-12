private void updateCvc(@android.support.annotation.NonNull
@com.stripe.android.model.Card.CardBrand
java.lang.String brand) {
    if (Card.AMERICAN_EXPRESS.equals(brand)) {
        mCvcEditText.setFilters(new android.text.InputFilter[]{ new android.text.InputFilter.LengthFilter(com.stripe.android.model.Card.CVC_LENGTH_COMMON) });
        mCvcTextInputLayout.setHint(getResources().getString(R.string.cvc_amex_hint));
    }else {
        mCvcEditText.setFilters(new android.text.InputFilter[]{ new android.text.InputFilter.LengthFilter(com.stripe.android.model.Card.CVC_LENGTH_AMERICAN_EXPRESS) });
        mCvcTextInputLayout.setHint(getResources().getString(R.string.cvc_number_hint));
    }
}