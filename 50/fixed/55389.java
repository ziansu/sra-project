@java.lang.Override
public java.util.Date findInceptionEndtDate(java.lang.Long projectId) {
    java.util.List<com.archsystemsinc.ipms.sec.model.FinancialHeader> header = headerDao.findRecentHeader(projectId);
    if (header != null)
        return header.get(0).getEndDate();
    
    return null;
}