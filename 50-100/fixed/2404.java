@java.lang.Override
public vn.com.hiringviet.model.Account checkLogin(java.lang.String email, java.lang.String password) {
    vn.com.hiringviet.dao.impl.AccountDAOImpl.LOGGER.info("check Login");
    org.hibernate.Session session = getSession();
    org.hibernate.Criteria criteria = session.createCriteria(vn.com.hiringviet.model.Account.class).add(org.hibernate.criterion.Restrictions.eq("status", StatusEnum.ACTIVE)).add(org.hibernate.criterion.Restrictions.eq("email", email)).add(org.hibernate.criterion.Restrictions.eq("password", password));
    vn.com.hiringviet.model.Account account = ((vn.com.hiringviet.model.Account) (criteria.uniqueResult()));
    return account;
}