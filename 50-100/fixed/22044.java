private boolean checkRequirements(at.oculus.teamf.domain.entity.Patient patient) {
    if ((((patient.getSocialInsuranceNr().equals("")) || (patient.getLastName().equals(""))) || (patient.getFirstName().equals(""))) || (patient.getBirthDay().equals(null))) {
        return false;
    }else {
        return true;
    }
}