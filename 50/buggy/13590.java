protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    boolean success = false;
    try {
        success = apiHandler.createUser(username, password);
    } catch (com.pinomg.determinator.net.ApiErrorException e) {
        e.printStackTrace();
    }
    return success;
}