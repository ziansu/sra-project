@java.lang.Override
public java.lang.Boolean deleteAttendance(int accountId, int eventId) {
    java.lang.Integer result = entityManager.createQuery("DELETE FROM Attendance a WHERE a.accountId = :accountId AND a.eventId = :eventId").setParameter("accountId", accountId).setParameter("eventId", eventId).executeUpdate();
    if (result == 1)
        return true;
    else
        return false;
    
}