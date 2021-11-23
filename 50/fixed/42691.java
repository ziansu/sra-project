@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true, propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
public com.nagarro.gde.persistence.model.UserOnlineTestDetail getTestDetailByToken(final java.lang.String token) {
    return onlineTestDetailDao.getTestDetailByToken(token);
}