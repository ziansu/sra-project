@java.lang.Override
public io.cattle.platform.core.model.Account getAccountById(java.lang.Long id) {
    return create().selectFrom(io.cattle.platform.iaas.api.auth.dao.impl.ACCOUNT).where(ACCOUNT.ID.eq(id).and(ACCOUNT.STATE.ne(CommonStatesConstants.PURGED)).and(ACCOUNT.KIND.ne(ProjectConstants.TYPE)).and(ACCOUNT.REMOVED.isNull())).fetchOne();
}