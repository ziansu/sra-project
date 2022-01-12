public void setRefreshTokenVar(java.lang.String refreshTokenVar) {
    this.refreshTokenVar = refreshTokenVar;
    this.refreshToken = java.lang.System.getenv(refreshTokenVar);
}