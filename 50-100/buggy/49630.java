private void removeExtraFacialData() {
    if ((FacialRecData.size()) > 6) {
        for (int i = 0; i < 6; i++) {
            FacialRecData.remove(((FacialRecData.size()) - 1));
            registrationDataObject.getBiometricData().remove(((FacialRecData.size()) - 1));
        }
    }
}