public void setCurrencyListView(android.view.View view) {
    isCurrency = true;
    if (isCurrency) {
        blink(cur);
        noBlink(vol);
        noBlink(len);
        noBlink(mass);
        noBlink(temp);
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