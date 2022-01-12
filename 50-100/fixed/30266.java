public boolean isSynchedTheOldWay(int strm, java.lang.String department) {
    boolean oldWay = true;
    if (department == null)
        return (org.sakaiquebec.opensyllabus.admin.cmjob.impl.OsylAbstractQuartzJobImpl.A2017_SESSION_LIMIT) >= strm;
    else
        return ((org.sakaiquebec.opensyllabus.admin.cmjob.impl.OsylAbstractQuartzJobImpl.A2017_SESSION_LIMIT) > strm) || (((org.sakaiquebec.opensyllabus.admin.cmjob.impl.OsylAbstractQuartzJobImpl.A2017_SESSION_LIMIT) == strm) && (!(department.equalsIgnoreCase(org.sakaiquebec.opensyllabus.admin.cmjob.impl.CERT_PILOTE_A2017))));
    
}