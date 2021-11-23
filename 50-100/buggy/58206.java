protected org.hni.user.om.User setPassword(org.hni.user.om.User user) {
    if (user != null) {
        user.setSalt(org.hni.security.utils.HNISecurityUtils.getSalt());
        user.setHashedSecret(org.hni.security.utils.HNISecurityUtils.getHash(user.getPassword(), user.getSalt().getBytes()));
    }
    return user;
}