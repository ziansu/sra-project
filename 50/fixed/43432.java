@java.lang.Override
public void run() {
    if ((isEditting) && ((spinnerCities.getSelectedItemPosition()) == 0)) {
        int i = cities.indexOf(business.city);
        spinnerCities.setSelection((i + 1));
    }
}