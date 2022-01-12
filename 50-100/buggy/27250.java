public java.lang.Long getRightByEmail(java.lang.String email) {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("email", email);
    java.lang.String sql = "select r_right.role_rights from mpos_cloud.mpos_admin as admin left join mpos_cloud.mpos_store as store on admin.store_id=store.store_id left join mpos_cloud.mpos_service as service on service.service_id=store.service_id left join mpos_cloud.mpos_admin_role_rights as r_right on r_right.role_id=service.role_id where admin.email=:email and store.status=true";
    java.lang.Object object = adminUserDao.getBySql(sql, params);
    java.lang.System.out.println(object.toString());
    java.math.BigInteger value = ((java.math.BigInteger) (object));
    return value.longValue();
}