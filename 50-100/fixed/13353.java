@java.lang.Override
public java.util.Collection<spring.desai.common.model.User> findLockedOutUsers() throws spring.desai.common.repository.exception.RepositoryDataAccessException {
    try {
        return getJdbcTemplate().query(getFindBySql(getTableName(), spring.desai.common.utils.DataBaseConstants.ACCOUNT_NON_LOCKED), new java.lang.Object[]{ "false" }, getRowMapper());
    } catch (org.springframework.dao.DataAccessException e) {
        throw new spring.desai.common.repository.exception.RepositoryDataAccessException(e);
    }
}