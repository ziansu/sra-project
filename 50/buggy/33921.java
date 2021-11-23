private java.lang.String yesNo(java.lang.String value) {
    if ((value.equalsIgnoreCase("yes")) || (value.equalsIgnoreCase("ya")))
        return getString(R.string.yes);
    else
        return getString(R.string.no);
    
}