public void setCurrencyListView(android.view.View view) {
    isCurrency = true;
    if ((isCurrency) == true) {
        blink(cur);
        noBlink(vol);
    }
    isVolume = false;
    isLength = false;
    isMass = false;
    isTemperature = false;
    cur.setVisibility(View.VISIBLE);
    len.setVisibility(View.INVISIBLE);
    mass.setVisibility(View.INVISIBLE);
    temp.setVisibility(View.INVISIBLE);
    vol.setVisibility(View.INVISIBLE);
    setListView(currencyTypes);
}