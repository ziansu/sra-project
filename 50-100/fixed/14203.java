@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.Set<com.softserve.edu.domain.Hotel> findHotels(java.lang.String city) {
    java.util.Set<com.softserve.edu.domain.Hotel> hotels = null;
    org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from City where name =:city");
    query.setParameter("city", city);
    java.util.List<com.softserve.edu.domain.City> list = query.list();
    if ((list.size()) > 0)
        hotels = list.get(0).getHotels();
    
    return hotels;
}