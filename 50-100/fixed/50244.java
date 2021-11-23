private eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry checkForChangedCollection(eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry constructedeuropeanaId) {
    eu.europeana.corelib.tools.lookuptable.EuropeanaIdRegistry retrievedId = retrieveFromOriginalXML(constructedeuropeanaId.getOrid(), constructedeuropeanaId.getXmlchecksum());
    if (retrievedId != null) {
        eu.europeana.corelib.tools.lookuptable.EuropeanaId eurId = new eu.europeana.corelib.tools.lookuptable.EuropeanaId();
        eurId.setNewId(constructedeuropeanaId.getEid());
        eurId.setOldId(retrievedId.getEid());
        eurId.setTimestamp(new java.util.Date().getTime());
        europeanaIdMongoServer.saveEuropeanaId(eurId);
        return retrievedId;
    }
    return null;
}