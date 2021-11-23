public void setPostalCode(java.lang.String postalCode) {
    Assert(((postalCode.length()) == 8));
    Assert((postalCode != ""));
    Assert((postalCode != null));
    this.postalCode = postalCode;
}