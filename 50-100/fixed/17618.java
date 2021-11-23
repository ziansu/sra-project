public void showAllCodes(java.util.ArrayList<java.lang.String> deviceCodes) {
    java.lang.String strDisplay = "";
    if ((deviceCodes != null) && (!(deviceCodes.isEmpty()))) {
        for (java.lang.String code : deviceCodes) {
            strDisplay = (strDisplay + code) + "\r\n";
        }
    }else {
        strDisplay = getResources().getString(R.string.codes_read_none);
    }
    tvCodes.setText(strDisplay);
}