byte[] processTime(int type) {
    int timelen = (type == (com.sohu.tv.ad.rdb.ParseRDB.REDIS_EXPIRETIME_FC)) ? 8 : 4;
    byte[] t = new byte[8];
    if (readBytes(t, 0, timelen)) {
        return t;
    }else {
        com.sohu.tv.ad.rdb.ParseRDB.ERROR("Could not read time");
    }
    return null;
}