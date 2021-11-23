public java.lang.String getApplicantName() {
    if ((this.applicantName) == null) {
        this.applicantName = this.getUserManager().getUser(this.getReport().getApplicantId().toString()).getProfile().getFullName();
    }
    return this.applicantName;
}