public PO getByUid(java.lang.String uid) {
    return get(br.ufrj.dcc.gerencia.dataaccess.base.CrudLdapDataAccess.query().where("uid").is(uid));
}