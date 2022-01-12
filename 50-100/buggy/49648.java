@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getProjectPartners(int projectID) {
    org.cgiar.ccafs.ap.data.dao.mysql.MySQLProjectPartnerDAO.LOG.debug(">> getProjectPartners projectID = {} )", projectID);
    java.lang.StringBuilder query = new java.lang.StringBuilder();
    query.append("SELECT pp.*   ");
    query.append("FROM project_partners as pp ");
    query.append("WHERE pp.project_id = ");
    query.append(projectID);
    query.append(" AND pp.is_active = 1 ");
    query.append("ORDER BY partner_id, partner_type");
    org.cgiar.ccafs.ap.data.dao.mysql.MySQLProjectPartnerDAO.LOG.debug("-- getProject() > Calling method executeQuery to get the results");
    return this.getData(query.toString());
}