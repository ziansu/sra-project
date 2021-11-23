@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String ean = s.toString();
    if (((ean.length()) == 10) && (!(ean.startsWith("978")))) {
        ean = "978" + ean;
    }
    if ((ean.length()) < 13) {
        return ;
    }
    startBookLoaderIntent(ean);
}