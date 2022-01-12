@java.lang.Override
public boolean init() {
    super.init();
    try {
        mongoClient = new com.mongodb.MongoClient(getConfigSection().getString("host"), getConfigSection().getInt("port"));
    } catch (java.net.UnknownHostException e) {
        return false;
    }
    if (((getDatabase()) == null) || (!(getDatabase().isAuthenticated()))) {
        return false;
    }
    return true;
}