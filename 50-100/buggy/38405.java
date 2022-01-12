private void init() {
    numberCard = ((android.widget.EditText) (findViewById(R.id._numberOfCard)));
    monthCard = ((android.widget.EditText) (findViewById(R.id._monthOfCard)));
    yearCard = ((android.widget.EditText) (findViewById(R.id._yearOfCard)));
    holderCard = ((android.widget.EditText) (findViewById(R.id._holderCard)));
    ccvCard = ((android.widget.EditText) (findViewById(R.id._ccvTxt)));
    pay = ((android.widget.LinearLayout) (findViewById(R.id.pay)));
    card = Administrator.cards.get(0);
}