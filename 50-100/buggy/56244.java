private void save() {
    ch.six.sixwallet.Goal i = new ch.six.sixwallet.Goal();
    i.setApi(((java.lang.String) (mSpinner.getSelectedItem())));
    i.setName(mName.getText().toString());
    i.setPhoneNumber(mPhoneNumber.getText().toString());
    java.util.ArrayList array = ch.six.sixwallet.utils.Utils.SharedPreferences.getSavedArray();
    array.add(i);
    ch.six.sixwallet.utils.Utils.SharedPreferences.saveArray(array);
}