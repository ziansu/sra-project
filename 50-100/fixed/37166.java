protected gov.ca.cwds.auth.realms.PerryAccount map(java.lang.String json) {
    try {
        return objectMapper.readValue(json, gov.ca.cwds.auth.realms.PerryAccount.class);
    } catch (java.io.IOException e) {
        gov.ca.cwds.auth.realms.JwtRealm.LOGGER.info(e.getMessage(), e);
        return new gov.ca.cwds.auth.realms.PerryAccount() {
            {
                setUser(json);
            }
        };
    }
}