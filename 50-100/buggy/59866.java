private void writeArticleAction(java.lang.String arg) {
    com.csci5448.accounts.JournalistAccount currentAccount = com.csci5448.control.Controller.getCurrentAccount(com.csci5448.accounts.JournalistAccount.class);
    if (!(currentAccount.isProfessionVerified())) {
        java.lang.System.out.println(("\tYour profession has not yet been verified. Please contact an administrator to " + "verify your account."));
        com.csci5448.control.Controller.goToLobbyPage();
    }
    com.csci5448.control.Controller.setCurrentPage(new com.csci5448.pages.journalist_pages.WriteArticlePage());
}