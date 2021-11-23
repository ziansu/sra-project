@java.lang.Override
public com.teamtreehouse.public_data.model.Country findCountryByCode(int code) {
    org.hibernate.Session session = com.teamtreehouse.public_data.dao.CountryDaoImpl.sessionFactory.openSession();
    com.teamtreehouse.public_data.model.Country country = session.get(com.teamtreehouse.public_data.model.Country.class, code);
    session.close();
    return country;
}