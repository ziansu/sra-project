@java.lang.Override
public void onFocusChange(android.view.View v, boolean event) {
    if (!event) {
        validateCreditCardNumber(true);
    }
}