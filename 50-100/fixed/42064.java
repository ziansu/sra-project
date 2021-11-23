@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String eanNumber = "";
    if (((s.length()) == (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_10)) || ((s.length()) == (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_13))) {
        eanNumber = validateISBN(s.toString());
    }
    if ((eanNumber.length()) == (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_13)) {
        callBookIntent(eanNumber);
    }
}