@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String input = Rollno.getText().toString();
    java.lang.String ptr = "((1(4|5|6)MI5((0[1-9])|([1-5][0-9])|60))|(1(4-6)M[1-5]((0[1-9])|([1-5][0-9])|60))|(116((0[1-9])|[1-5][0-9]|60))|(1(5|6)MI4((0[1-9])|([1-5][0-9])|60))|(1[2-6][1-7]((0[1-9])|([1-8][0-9])|90))|(IIITU1(5|6)(1|2)((0[1-9])|([1-2][0-9])|30)))";
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(ptr);
    java.util.regex.Matcher m = p.matcher(input.toUpperCase().trim());
    if (m.matches()) {
        rollnoTextInputLayout.setErrorEnabled(false);
        isValidRollNo = true;
    }else {
        isValidRollNo = false;
        Rollno.setError("Enter Valid RollNo");
    }
}