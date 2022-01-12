@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.lang.Boolean insertAccount(calendar.model.Account account) {
    return accountDAO.insertAccount(account);
}