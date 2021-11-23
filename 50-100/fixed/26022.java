@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((ephone.getText().toString().length()) <= 9) {
        validationphone1.setVisibility(View.VISIBLE);
        OK.setEnabled(false);
        OK.setBackgroundColor(getResources().getColor(R.color.mauxam));
        z = 0;
        setOKenable();
    }else {
        validationphone1.setVisibility(View.GONE);
        z = 1;
    }
}