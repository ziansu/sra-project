public com.sendgrid.SendGrid.Email addSubstitution(java.lang.String key, java.lang.String[] val) {
    this.smtpapi.addSubstitutions(key, val);
    return this;
}