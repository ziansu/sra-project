@org.springframework.transaction.annotation.Transactional
public boolean authenticateLoginInfo(java.lang.String userName, java.lang.String password) {
    org.hibernate.criterion.Criterion[] criterion = new org.hibernate.criterion.Criterion[]{ org.hibernate.criterion.Restrictions.eq("account_name", userName) };
    java.util.List<com.ipcs.model.Person> persons = personDao.createCriteria(criterion);
    if (((null == persons) || ((persons.size()) > 1)) || ((persons.size()) == 0))
        return false;
    
    return persons.get(0).getPassword_hash().equals(password);
}