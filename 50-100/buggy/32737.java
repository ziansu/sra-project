protected java.util.List<com.stackmob.sdk.model.StackMobModel> updateModelListFromJson(com.google.gson.JsonArray array, java.util.Collection<com.stackmob.sdk.model.StackMobModel> existingModels, java.lang.Class<? extends com.stackmob.sdk.model.StackMobModel> modelClass) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.util.List<com.stackmob.sdk.model.StackMobModel> result = new java.util.ArrayList<com.stackmob.sdk.model.StackMobModel>();
    for (com.google.gson.JsonElement json : array) {
        com.stackmob.sdk.model.StackMobModel model = getExistingModel(existingModels, json);
        if (model == null)
            model = modelClass.newInstance();
        
        model.fillFromJSON(json);
        result.add(model);
    }
    return result;
}