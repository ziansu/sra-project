private java.lang.String yesNo(java.lang.String value) {
    if ((value.toLowerCase().contains("yes")) || (value.toLowerCase().contains("ya")))
        return getString(R.string.yes);
    else
        return getString(R.string.no);
    
}