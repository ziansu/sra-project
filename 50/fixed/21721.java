private void deleteIndex(com.stratelia.webactiv.util.WAPrimaryKey pk) {
    com.stratelia.webactiv.util.indexEngine.model.IndexEngineProxy.removeIndexEntry(new com.stratelia.webactiv.util.indexEngine.model.IndexEntryPK(pk.getComponentName(), "card", pk.getId()));
}