public com.google.appengine.api.datastore.Key getKey() {
    if ((this.key) != null) {
        return this.key;
    }
    try {
        return com.macklive.storage.DataManager.getInstance().getTeamByName(this.name).getKey();
    } catch (com.google.appengine.api.datastore.PreparedQuery.TooManyResultsException e) {
        e.printStackTrace();
        return null;
    }
}