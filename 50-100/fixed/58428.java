@java.lang.Override
public int getUserRoleInCorp(long userId, int corpId) {
    org.hibernate.Query query = getSession().createSQLQuery("SELECT role_id FROM tb_corporation_and_user WHERE user_id = :userId AND corporation_id = :corpId");
    query.setLong("userId", userId).setInteger("corpId", corpId);
    java.lang.Object result = query.uniqueResult();
    if (result == null) {
        return -1;
    }
    return java.lang.Integer.parseInt(result.toString());
}