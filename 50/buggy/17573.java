public void setAddresses(java.util.Set<org.openmrs.PersonAddress> addresses) {
    this.getAddresses().clear();
    this.addresses = new java.util.TreeSet<org.openmrs.PersonAddress>(addresses);
}