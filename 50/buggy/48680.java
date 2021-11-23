public void startMemberRegistrationForm(boolean qrCode, java.util.HashMap<java.lang.String, java.lang.String> overrides) {
    overrides.putAll(util.VaccinatorUtils.providerDetails());
    if (qrCode)
        startRegistration();
    else
        startForm(getMemberRegistrationForm(overrides), "", overrides);
    
}