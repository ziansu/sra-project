public void setURI(java.lang.String uri) {
    if (org.ucl.medicaldb.Patient.checker.isValidURI(uri)) {
        this.uri = uri;
    }
}