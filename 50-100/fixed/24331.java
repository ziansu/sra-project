public java.lang.String getPersonJson(final java.lang.String userName, final java.lang.String password) throws java.io.IOException {
    com.mobidevday.demo.network.BasicHelper.mRetries = 0;
    java.net.Authenticator.setDefault(new java.net.Authenticator() {
        protected java.net.PasswordAuthentication getPasswordAuthentication() {
            if ((com.mobidevday.demo.network.BasicHelper.mRetries) > 0) {
                throw new java.lang.SecurityException("Unauthorized");
            }
            (com.mobidevday.demo.network.BasicHelper.mRetries)++;
            return new java.net.PasswordAuthentication(userName, password.toCharArray());
        }
    });
    com.mobidevday.demo.network.WebResult result = executeHTTP(Settings.BASIC_URL);
    return result.getHttpBody();
}