public boolean signUp(java.lang.String userName, java.lang.String password, java.lang.String phoneNumber) {
    mPhoneNumber = phoneNumber;
    java.lang.String[] params = new java.lang.String[]{ userName , password , phoneNumber };
    com.ahlan.ahlanapp.Query q = new com.ahlan.ahlanapp.Query(Constants.signUp_client, params);
    com.ahlan.ahlanapp.SendData.getInstance().addToOutQueue(q);
    com.ahlan.ahlanapp.Query answer = waitForResponse(Constants.signUp_server);
    return (java.lang.Integer.getInteger(answer.getStr()[0])) == (Constants.success);
}