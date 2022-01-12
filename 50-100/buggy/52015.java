@java.lang.SuppressWarnings(value = "unchecked")
public java.util.Set<com.softserve.edu.domain.Visa> find(java.lang.String firstName, java.lang.String lastName) {
    java.util.Set<com.softserve.edu.domain.Visa> visas = null;
    org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from Client where firstName =:fName and lastName =:lName");
    query.setParameter("fName", firstName);
    query.setParameter("lName", lastName);
    java.util.List<com.softserve.edu.domain.Client> list = query.list();
    visas = list.get(0).getVisas();
    return visas;
}