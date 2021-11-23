@com.google.api.server.spi.config.ApiMethod(name = "finishUpload")
public void finishUpload(@javax.inject.Named(value = "username")
java.lang.String username, @javax.inject.Named(value = "password")
java.lang.String password) {
    try {
        com.google.appengine.api.datastore.Entity CurrentUser = com.gh0u1l5.g_protector.backend.MyEndpoint.mDatastore.get(com.google.appengine.api.datastore.KeyFactory.createKey("Users", username));
        if (!(CurrentUser.getProperty("password").toString().equals(password)))
            return ;
        
        com.gh0u1l5.g_protector.backend.MyEndpoint.UpdatingList.remove(username);
    } catch (com.google.appengine.api.datastore.EntityNotFoundException e) {
        e.printStackTrace();
    }
}