public java.util.List<se.sogeti.jobapplications.beans.business.BusinessSectorJob> getByFieldAndBoolAndLastApplicationDayNotPassed(java.lang.String field, boolean param) throws java.sql.SQLException {
    java.lang.System.out.println("getByFieldAndBoolAndLastApplicationDayNotPassed i BusinessSectorJobDAO");
    se.unlogic.standardutils.dao.HighLevelQuery<se.sogeti.jobapplications.beans.business.BusinessSectorJob> query = new se.unlogic.standardutils.dao.HighLevelQuery<se.sogeti.jobapplications.beans.business.BusinessSectorJob>();
    query.addParameter(this.getParamFactory(field, java.lang.Boolean.class).getParameter(param));
    query.addParameter(this.getParamFactory("lastApplicationDay", java.sql.Date.class).getParameter(new java.sql.Date(java.util.Calendar.getInstance().getTimeInMillis()), QueryOperators.BIGGER_THAN_OR_EUALS));
    return this.getAll(query);
}