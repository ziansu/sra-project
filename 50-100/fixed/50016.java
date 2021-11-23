public byte[] getById(long secKillId) throws java.lang.Exception {
    com.roy.publics.seckill.bean.SecKill kill = secKillDao.queryById(secKillId);
    java.lang.String newName = kill.getName();
    kill.setName((newName + "get from port 8094"));
    return com.roy.publics.utils.ProtoStuffUtil.serializer(kill);
}