@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public ru.kolaer.api.mvp.model.kolaerweb.GeneralAccountsEntity getAccountByNameWithEmployee(java.lang.String username) {
    final ru.kolaer.api.mvp.model.kolaerweb.GeneralAccountsEntity acc = this.findName(username);
    if (acc != null)
        org.hibernate.Hibernate.initialize(acc.getGeneralEmployeesEntity());
    
    return acc;
}