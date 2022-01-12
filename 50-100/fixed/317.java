public static java.lang.Boolean setAPIkey(java.lang.String key) {
    java.lang.System.setProperty("WORDNIK_API_KEY", key);
    net.jeremybrooks.knicker.dto.TokenStatus status;
    try {
        status = net.jeremybrooks.knicker.AccountApi.apiTokenStatus();
        if (status.isValid())
            return true;
        else {
            java.lang.System.out.println("API key is invalid!");
            java.lang.System.exit(1);
            return false;
        }
    } catch (net.jeremybrooks.knicker.KnickerException e) {
        java.lang.System.out.println("Set your API key!");
        e.printStackTrace();
        return false;
    }
}