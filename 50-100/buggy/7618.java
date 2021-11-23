private java.lang.String getAccountsUrl(java.lang.String deploymentUrl, java.lang.String username) {
    if (deploymentUrl.endsWith("/")) {
        deploymentUrl = deploymentUrl.substring(0, ((deploymentUrl.length()) - 1));
    }
    java.lang.String accountsUrl = ((deploymentUrl + "/2012-04-24/Accounts/") + username) + "/Supervisor.json";
    return accountsUrl;
}