private void init() {
    try {
        userName = androphsyProperties.getProperty(AndrophsyConstants.DATABASE_USERNAME);
        password = androphsyProperties.getProperty(AndrophsyConstants.DATABASE_PASSWORD);
        dbName = androphsyProperties.getProperty(AndrophsyConstants.DATABASE_NAME);
        url = androphsyProperties.getProperty(AndrophsyConstants.DATABASE_URL);
    } catch (lk.score.androphsy.exceptions.PropertyNotDefinedException e) {
        e.printStackTrace();
    }
}