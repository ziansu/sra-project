public static Employee getOwner(int meetingID) {
    java.util.List<EmployeeMeeting> eml = EmployeeMeetingDB.getInstance().loadAll();
    for (int i = 0; i < (eml.size()); i++) {
        EmployeeMeeting em = eml.get(i);
        if (((em.meetingID) == meetingID) && (em.isOwner)) {
            return EmployeeDB.getInstance().load(em.employeeID);
        }
    }
    return l;
}