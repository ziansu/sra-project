@java.lang.Override
public models.Account getByEmailAndPassword(models.Account account) {
    models.Account acc = ((models.Account) (getBaseCriteria().add(org.hibernate.criterion.Restrictions.eq("email", account.getEmail())).uniqueResult()));
    if ((acc != null) && (repositories.BCrypt.checkpw(account.getPassword(), acc.getPassword()))) {
        return account;
    }
    return null;
}