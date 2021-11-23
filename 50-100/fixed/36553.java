private java.util.Collection<com.b2international.snowowl.datastore.CodeSystemVersionEntry> getCodeSystemVersions() {
    if (extensionOnly) {
        return com.b2international.snowowl.terminologyregistry.core.request.CodeSystemRequests.prepareSearchCodeSystemVersion().all().filterByCodeSystemShortName(codeSystemShortName).build(SnomedDatastoreActivator.REPOSITORY_UUID).execute(getEventBus()).getSync().getItems();
    }
    return collectAllCodeSystemVersions(getCodeSystem(codeSystemShortName));
}