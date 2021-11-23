public int findCurrentIdbyStudentId(int sid) {
    java.util.List<com.javaweb.po.Lease> leases = this.queryByForeignId(com.javaweb.po.Lease.class, "studentId", sid);
    if (leases != null) {
        for (com.javaweb.po.Lease element : leases) {
            if (element.getStatus().equals("current"))
                return element.getId();
            
        }
    }
    return -1;
}