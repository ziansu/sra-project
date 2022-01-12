private void save() {
    ch.six.sixwallet.Goal i = new ch.six.sixwallet.Goal(mName.getText().toString(), mPhoneNumber.getText().toString(), ((java.lang.String) (mSpinner.getSelectedItem())));
    i.save(this);
}