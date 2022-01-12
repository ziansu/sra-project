protected void fillModelArrayFieldFromJson(java.lang.reflect.Field field, com.google.gson.JsonArray array) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.Class<? extends com.stackmob.sdk.model.StackMobModel> actualModelClass = ((java.lang.Class<? extends com.stackmob.sdk.model.StackMobModel>) (com.stackmob.sdk.util.SerializationMetadata.getComponentClass(field)));
    java.util.Collection<com.stackmob.sdk.model.StackMobModel> existingModels = getFieldAsCollection(field);
    java.util.List<com.stackmob.sdk.model.StackMobModel> newModels = updateModelListFromJson(array, existingModels, actualModelClass);
    setFieldFromList(field, newModels, actualModelClass);
}