private java.lang.String validateISBN(java.lang.String eanStr) {
    java.lang.String result = eanStr;
    if (((eanStr.length()) == (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_10)) && (!(eanStr.startsWith(java.lang.Integer.toString(Constants.ISBN_PREFIX))))) {
        result = (java.lang.Integer.toString(Constants.ISBN_PREFIX)) + eanStr;
    }
    if ((eanStr.length()) < (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_13)) {
        android.widget.Toast.makeText(getActivity(), "Enter 13 digit ISBN number!", Toast.LENGTH_SHORT).show();
        clearFields();
    }
    return result;
}