protected com.stackmob.sdk.model.StackMobModel getExistingModel(java.util.Collection<com.stackmob.sdk.model.StackMobModel> oldList, com.google.gson.JsonElement json) {
    if (oldList != null) {
        for (com.stackmob.sdk.model.StackMobModel model : oldList) {
            if (model.hasSameID(json)) {
                oldList.remove(model);
                return model;
            }
        }
    }
    return null;
}