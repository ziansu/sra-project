@java.lang.Override
public void setAssignOrder(int driverId, int trackingNumber, java.sql.Timestamp carArriveTime) {
    javax.persistence.Query query = entityManager.createNativeQuery("UPDATE taxi_order_item SET driver_id = ? WHERE tracking_number = ?");
    query.setParameter(1, driverId);
    query.setParameter(1, trackingNumber);
    javax.persistence.Query query2 = entityManager.createNativeQuery(("UPDATE taxi_order SET status = 'ASSIGNED', arrive_date = ? " + "WHERE tracking_number = ?"));
    query2.setParameter(1, carArriveTime);
    query2.setParameter(2, trackingNumber);
    query.executeUpdate();
    query2.executeUpdate();
}