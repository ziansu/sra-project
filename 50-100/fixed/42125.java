public void setLastName(java.lang.String lastName) {
    if (org.ucl.medicaldb.Patient.checker.completedObligatoryField(lastName)) {
        if (org.ucl.medicaldb.Patient.checker.isValid(lastName, "name")) {
            this.lastName = lastName.trim();
        }else {
            org.ucl.medicaldb.Patient.checker.setErrors("<html>Invalid <font color=red>last name</font></html>");
        }
    }else {
        org.ucl.medicaldb.Patient.checker.setErrors("<html>Missing <font color=red>last name</font></html>");
    }
}