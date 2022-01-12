@butterknife.OnClick(value = { R.id.calc_one_textview , R.id.calc_two_textview , R.id.calc_three_textview , R.id.calc_four_textview , R.id.calc_five_textview , R.id.calc_six_textview , R.id.calc_seven_textview , R.id.calc_eight_textview , R.id.calc_nine_textview , R.id.calc_zero_textview , R.id.calc_divide_textview , R.id.calc_multiply_textview , R.id.calc_plus_textview , R.id.calc_minus_textview , R.id.calc_delimiter_textview })
public void editTextClick(android.widget.Button button) {
    java.lang.String buttonText = button.getText().toString();
    java.lang.String editText = mEditTextView.getText().toString();
    double zero = 0;
    java.lang.String zeroStr = java.lang.String.format(java.util.Locale.getDefault(), "%.2f", zero);
    if (!(editText.equals(zeroStr))) {
        editText = editText + buttonText;
    }else {
        editText = buttonText;
    }
    mEditTextView.setText(editText);
}