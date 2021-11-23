@java.lang.Override
public java.util.List<edu.ctu.thesis.travelsystem.model.BookTour> registrationListByValue(java.lang.String value, int idTour) {
    org.hibernate.Session session = getCurrentSession();
    java.lang.String hql = "FROM BookTour WHERE ID_TOUR = :idTour AND CUS_CANCEL = false AND (cusName LIKE :value OR cusEmail LIKE :value OR cusPhone LIKE :value OR cusIdCard LIKE :value)";
    org.hibernate.Query query = session.createQuery(hql);
    query.setParameter("idTour", idTour);
    query.setParameter("value", (("%" + value) + "%"));
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<edu.ctu.thesis.travelsystem.model.BookTour> registrationList = query.list();
    return registrationList;
}