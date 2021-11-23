private boolean isFormValid() {
    java.lang.String rootUrl = rootUrlTF.getText();
    if ((((rootUrl != null) && (rootUrl != "")) && ((branchRL.getResources()) != null)) && ((leafRL.getResources()) != null)) {
        return true;
    }
    return false;
}