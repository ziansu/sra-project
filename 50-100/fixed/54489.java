@java.lang.Override
public io.cattle.platform.core.model.Account getAccountByExternalId(java.lang.String externalId, java.lang.String externalType) {
    return create().selectFrom(io.cattle.platform.iaas.api.auth.dao.impl.ACCOUNT).where(ACCOUNT.EXTERNAL_ID.eq(externalId).and(ACCOUNT.EXTERNAL_ID_TYPE.eq(externalType)).and(ACCOUNT.STATE.ne("purged"))).orderBy(ACCOUNT.ID.asc()).fetchOne();
}