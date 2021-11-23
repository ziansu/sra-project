public com.onestap.auth.model.domain.entities.AuthToken getToken() {
    return localDataManager.get(Options.ACCESS_TOKEN.name(), com.onestap.auth.model.domain.entities.AuthToken.class);
}