private com.fh.entity.UserEntity getUserFromCache() {
    java.lang.String token = this.getToken();
    if (org.apache.commons.lang.StringUtils.isEmpty(token)) {
        return null;
    }
    return this.getUserFromCache(token);
}