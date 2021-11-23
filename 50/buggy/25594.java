private boolean responseHasProperty() throws java.lang.Exception {
    if (webPageSource.contains(wantedParameter)) {
        return true;
    }else {
        throw new java.lang.Exception(("Response doesn't contains parameter: " + (wantedParameter)));
    }
}