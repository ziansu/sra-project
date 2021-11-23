private void removeExtraFacialData() {
    while ((FacialRecData.size()) > 6) {
        FacialRecData.remove(((FacialRecData.size()) - 1));
    } 
    while ((registrationDataObject.getBiometricData().size()) > 6) {
        registrationDataObject.getBiometricData().remove(((registrationDataObject.getBiometricData().size()) - 1));
    } 
}