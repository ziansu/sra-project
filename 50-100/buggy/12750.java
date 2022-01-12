public boolean storeCredentials(java.lang.String appName, java.lang.String hashedUser, java.lang.String hashedPassword) {
    try {
        com.jeszka.domain.AppCredentials appCredentials = new com.jeszka.domain.AppCredentials.Builder().appName(appName).username(hashedUser).password(hashedPassword).enabled(true).build();
        final int result = posterDao.saveAppCredentials(appCredentials);
        java.lang.System.out.println(("Storing credentials result: " + result));
        return true;
    } catch (org.springframework.dao.DuplicateKeyException e) {
        java.lang.System.out.println(("Storing credentials not successful " + (e.getMessage())));
        return false;
    }
}