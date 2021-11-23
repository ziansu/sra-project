public boolean isSignedIn() {
    try {
        return new com.stamps.web.print.postage.elements.labels.startinglabels.SignedInUserSpan(driver).isEnabled();
    } catch (java.lang.Exception e) {
        return false;
    }
}