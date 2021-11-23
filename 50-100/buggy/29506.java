private void load() throws java.io.IOException, nami.connector.exception.NamiApiException {
    long startTimeInMillis = java.lang.System.currentTimeMillis();
    java.util.Collection<nami.connector.namitypes.NamiMitgliedListElement> result = namiSearchedValues.getAllResults(connector);
    int i = 0;
    int items = result.size();
    for (nami.connector.namitypes.NamiMitgliedListElement element : result) {
        nami.connector.namitypes.NamiMitglied member = element.getFullData(connector);
        handler.onUpdate(i, items, member);
        i++;
    }
    handler.onDone(((java.lang.System.currentTimeMillis()) - startTimeInMillis));
}