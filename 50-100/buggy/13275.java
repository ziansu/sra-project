@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public int averageTimeOfBooking(java.lang.String hotel) {
    int days = 0;
    org.hibernate.Query query = sessionFactory.getCurrentSession().createSQLQuery(("SELECT AVG( DATEDIFF(br.end_date, br.start_date) ) " + (((("FROM booking br " + "JOIN client_tours ct ON br.client_tour_id=ct.client_tour_id ") + " JOIN hotel_rooms r on br.room_id=r.room_id ") + "  JOIN hotels h on r.hotel_id=h.hotel_id ") + " WHERE h.name= :hotel")));
    query.setParameter("hotel", "Hotel Metropol");
    java.util.List list = query.list();
    days = ((java.lang.Number) (list.get(0))).intValue();
    return days;
}