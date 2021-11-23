private void addToAvailableActions(java.lang.Class<? extends org.openflexo.foundation.fml.editionaction.EditionAction> availableActionClass, org.openflexo.foundation.technologyadapter.TechnologyAdapter ta) {
    availableActions.add(availableActionClass);
    editionActionForTechnologyAdapterMap.put(availableActionClass, ta);
    if (org.openflexo.foundation.fml.editionaction.FetchRequest.class.isAssignableFrom(availableActionClass)) {
        availableFetchRequests.add(((java.lang.Class<org.openflexo.foundation.fml.editionaction.FetchRequest<?, ?>>) (availableActionClass)));
    }
}