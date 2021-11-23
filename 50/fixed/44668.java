@java.lang.Override
public void call(java.util.List<com.google.gson.JsonObject> jsonObjects) {
    if ((jsonObjects.size()) != 0) {
        getView().setProgressMax(jsonObjects.size());
    }
}