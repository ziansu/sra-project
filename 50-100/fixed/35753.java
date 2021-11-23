@com.softserve.edu.documents.document.meta.Placeholder(name = "CALIBRATOR_COMPANY_ADDRESS")
public java.lang.String getCalibratorCompanyAddress() {
    com.softserve.edu.entity.Address address = getVerification().getCalibrator().getAddress();
    return ((((address.getLocality()) + ", ") + (address.getStreet())) + ", ") + (address.getBuilding());
}