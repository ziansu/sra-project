@java.lang.Override
public void onSuccess(java.util.Map<java.lang.String, java.lang.String> result) {
    if (null != result) {
        org.instantplaces.purewidgets.client.application.PublicDisplayApplication.parameters = result;
        for (java.lang.String key : result.keySet()) {
            org.instantplaces.purewidgets.shared.Log.debug(org.instantplaces.purewidgets.client.application.PublicDisplayApplication.class.getName(), ((("Loaded from remote datastore: " + key) + ": ") + (result.get(key))));
        }
    }
    org.instantplaces.purewidgets.client.application.PublicDisplayApplication.listener.onApplicationLoaded();
}