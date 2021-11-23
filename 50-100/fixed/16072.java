protected static com.stackmob.sdk.model.StackMobModel getExistingModel(java.util.Collection<? extends com.stackmob.sdk.model.StackMobModel> oldList, com.google.gson.JsonElement json) {
    if (oldList != null) {
        for (com.stackmob.sdk.model.StackMobModel model : oldList) {
            if (model.hasSameID(json)) {
                return model;
            }
        }
    }
    return null;
}