private java.util.List<de.lampware.racing.istats.model.Result> createFromDataObject(com.google.gson.JsonObject dataObject) {
    com.google.gson.JsonArray jsonResults = dataObject.getAsJsonArray(de.lampware.racing.istats.json.ResultCollectionFactory.RESULTS_KEY);
    return java.util.stream.StreamSupport.stream(jsonResults.spliterator(), false).map(resultFactory::create).collect(java.util.stream.Collectors.toList());
}