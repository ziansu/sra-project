public java.lang.String getContactPersonEmail() {
    if ((client) != null) {
        return (contactSameAsClient) == 1 ? client.getEmail() : contactPersonEmail;
    }
    return contactPersonEmail;
}