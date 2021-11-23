boolean isExpired() {
    return new java.sql.Date(java.lang.System.currentTimeMillis()).after(this.expire);
}