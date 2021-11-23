@java.lang.Override
public com.softserve.edu.domain.Client find(java.lang.String firstName, java.lang.String lastName) {
    com.softserve.edu.domain.Client client = null;
    org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from Client where firstName =:fName and lastName =:lName");
    query.setParameter("fName", firstName);
    query.setParameter("lName", lastName);
    java.util.List<com.softserve.edu.domain.Client> list = query.list();
    if ((list.size()) > 0)
        client = list.get(0);
    
    return client;
}