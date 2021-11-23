public boolean signIn(java.lang.String userName, java.lang.String password) {
    java.lang.String[] params = new java.lang.String[]{ userName , password };
    com.ahlan.ahlanapp.Query q = new com.ahlan.ahlanapp.Query(Constants.signIn_client, params);
    com.ahlan.ahlanapp.SendData.getInstance().addToOutQueue(q);
    com.ahlan.ahlanapp.Query answer = waitForResponse(Constants.signIn_server);
    return (java.lang.Integer.getInteger(answer.getStr()[0])) == (Constants.success);
}