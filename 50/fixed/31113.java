@javax.transaction.Transactional
@java.lang.Override
public java.lang.String invoke(com.crossover.techtrial.java.se.model.user.User user) {
    validateUser(user);
    encryptUserPassword(user);
    userHibernateDao.saveUser(user);
    com.crossover.techtrial.java.se.dto.account.Account account = createInitialAccountForUser(user);
    depositInitialAmount(account);
    return user.getName();
}