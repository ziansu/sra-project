private java.lang.String validateISBN(java.lang.String eanStr) {
    if (((eanStr.length()) == (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_10)) && (!(eanStr.startsWith(java.lang.Integer.toString(Constants.ISBN_PREFIX))))) {
        eanStr = (java.lang.Integer.toString(Constants.ISBN_PREFIX)) + eanStr;
    }
    if ((eanStr.length()) < (it.jaschke.alexandria.utils.Constants.ISBN_LENGTH_13)) {
        clearFields();
    }
    return eanStr;
}