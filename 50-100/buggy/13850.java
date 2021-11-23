public com.example.c301_w16_g5.c301_w16_g5.User getUserFromDatabase(java.lang.String username) {
    com.example.c301_w16_g5.c301_w16_g5.User user = null;
    if (checkOnline()) {
        com.example.c301_w16_g5.c301_w16_g5.ElasticSearchBackend.GetUserByUsernameTask getUserTask = new com.example.c301_w16_g5.c301_w16_g5.ElasticSearchBackend.GetUserByUsernameTask();
        getUserTask.execute(username);
        try {
            user = getUserTask.get();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } catch (java.util.concurrent.ExecutionException e) {
            e.printStackTrace();
        }
        saveUserOffline(user);
    }else {
        user = loadUserOffline(username);
    }
    return user;
}