private boolean isFormValid() {
    java.lang.String rootUrl = rootUrlTF.getText();
    if (((rootUrl != null) && (rootUrl != "")) && ((leafRL.getResources()) != null)) {
        return true;
    }
    return false;
}