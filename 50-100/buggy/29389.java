private java.lang.String getCurrentDisplay() {
    return org.javarosa.core.services.locale.Localization.get("sending.status.multi", new java.lang.String[]{ java.lang.String.valueOf(currentid) , java.lang.String.valueOf(ids.size()) , java.lang.String.valueOf(((currentid) + 1)) , java.lang.String.valueOf(ids.size()) });
}