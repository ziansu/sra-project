public java.lang.String createAccount(java.lang.String username, java.lang.String password, java.lang.String server) {
    com.liamfruzyna.android.wishlister.data.IO.CreateAccountTask task = new com.liamfruzyna.android.wishlister.data.IO.CreateAccountTask();
    task.execute(server, username, password);
    java.lang.String status = task.status;
    while (status.equals("RUNNING")) {
        status = task.status;
    } 
    java.lang.System.out.println(status);
    return task.status;
}