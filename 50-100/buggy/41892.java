@java.lang.Override
public com.beetle.framework.resource.define.PageList<com.beetle.component.security.dto.SecUsers> compositeQuery(long userid, java.lang.String username, int lock, int pageNumber, int pageSize) throws com.beetle.component.security.service.SecurityServiceException {
    try {
        return userDao.compositeQuery(userid, username, lock, pageNumber, pageSize);
    } catch (com.beetle.framework.persistence.access.operator.DBOperatorException e) {
        throw new com.beetle.component.security.service.SecurityServiceException(e);
    }
}