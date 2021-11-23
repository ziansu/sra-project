public void setDOB(java.lang.String DOB) {
    if (org.ucl.medicaldb.Patient.checker.completedObligatoryField(DOB)) {
        this.DOB = DOB;
    }
}