@java.lang.Override
public java.util.List<calendar.model.Attendance> selectAttendancesByEventId(int eventId) {
    javax.persistence.TypedQuery<calendar.model.Attendance> query = entityManager.createQuery("SELECT p FROM Attendance p WHERE p.eventId = :eventId", calendar.model.Attendance.class);
    query.setParameter("eventId", eventId);
    java.util.List<calendar.model.Attendance> attendances = query.getResultList();
    return attendances;
}