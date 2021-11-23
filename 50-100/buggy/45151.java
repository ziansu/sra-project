private static long nextId() {
    long id = (com.giisoo.core.conf.SystemConfig.l("user_prefix", 10000000000000L)) + (com.giisoo.framework.common.UID.next("user.id"));
    while (com.giisoo.framework.common.Bean.exists("id=?", new java.lang.Object[]{ id }, com.giisoo.framework.common.User.class)) {
        id = (com.giisoo.core.conf.SystemConfig.l("user_prefix", 10000000000000L)) + (com.giisoo.framework.common.UID.next("user.id"));
    } 
    return id;
}