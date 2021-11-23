public void setNumber(java.lang.String number) {
    try {
        java.lang.String iso = null;
        if ((mSelectedCountry) != null) {
            iso = mSelectedCountry.getIso();
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber = mPhoneUtil.parse(number, iso);
        int countryIdx = mCountries.indexOfIso(mPhoneUtil.getRegionCodeForNumber(phoneNumber));
        mCountrySpinner.setSelection(countryIdx);
        mPhoneEdit.setText(mPhoneUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.NATIONAL));
    } catch (com.google.i18n.phonenumbers.NumberParseException ignored) {
    }
}