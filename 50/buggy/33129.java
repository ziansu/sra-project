public void deleteUser(java.lang.String name) {
    zrem(com.sincetimes.website.app.security.vo.redis.UserProvider.USERS_SET, name);
    del(name);
}