public com.example.natis.hagana.Model.ClientUser getOneUser(java.lang.String uid) {
    return com.example.natis.hagana.Model.ClientUserSQL.getUser(modelSql.getReadableDatabase(), uid);
}