public void setRegistrationNumber(java.lang.String registrationNumber) {
    if ((registrationNumber == null) || (!(fiskinfoo.no.sintef.fiskinfoo.Implementation.FiskInfoUtility.validateRegistrationNumber(registrationNumber)))) {
        return ;
    }
    countyEditText.setText(registrationNumber.substring(0, 2));
    vesselNumberEditText.setText(registrationNumber.substring(2, 6));
    municipalityEditText.setText(registrationNumber.substring(6, 8));
}