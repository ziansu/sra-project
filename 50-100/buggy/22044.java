private boolean checkRequirements(at.oculus.teamf.domain.entity.Patient patient) {
    if (((((patient.getSocialInsuranceNr()) == "") || ((patient.getLastName()) == "")) || ((patient.getFirstName()) == "")) || ((patient.getBirthDay()) == null)) {
        return false;
    }else {
        return true;
    }
}