static void loginToAccount(java.lang.String username, java.lang.String password) {
    com.example.ollie.workoutapp.Account account = com.example.ollie.workoutapp.Database.realm.where(com.example.ollie.workoutapp.Account.class).equalTo("username", username, Case.INSENSITIVE).equalTo("password", password).findFirst();
    if (account != null) {
        com.example.ollie.workoutapp.Database.currentAccount = com.example.ollie.workoutapp.Database.realm.copyFromRealm(account);
    }else {
        com.example.ollie.workoutapp.Database.currentAccount = null;
    }
}