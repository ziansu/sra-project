@java.lang.Override
public eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry retrieveEuropeanaIdFromNew(java.lang.String newId) {
    java.util.List<eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry> retrList = datastore.find(eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry.class).field(eu.europeana.corelib.lookup.impl.EuropeanaIdRegistryMongoServerImpl.EID).equal(newId).asList();
    if (retrList.isEmpty()) {
        return null;
    }else {
        for (eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry entry : retrList) {
            if (!(entry.isDeleted())) {
                return entry;
            }
        }
        return null;
    }
}