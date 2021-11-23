public com.barterbayucsb.barterbay.User retrieve_user_by_id(java.lang.String id) {
    try {
        new com.barterbayucsb.barterbay.ServerGate.RetrieveTasks("retrieve_user_by_id", id).execute().get(USER_TIME_LIMIT, java.util.concurrent.TimeUnit.MILLISECONDS);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return mUser;
}