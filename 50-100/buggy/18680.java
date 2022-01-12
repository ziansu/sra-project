@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.dotmarketing.portlets.templates.model.Template> findTemplatesAssignedTo(com.dotmarketing.beans.Host parentHost, boolean includeArchived) throws com.dotmarketing.exception.DotHibernateException {
    com.dotmarketing.db.HibernateUtil hu = new com.dotmarketing.db.HibernateUtil(com.dotmarketing.portlets.templates.model.Template.class);
    java.lang.String query = (!includeArchived) ? ((templatesUnderHostSQL) + " and vi.deleted = ") + (com.dotmarketing.db.DbConnectionFactory.getDBFalse()) : templatesUnderHostSQL;
    hu.setSQLQuery(templatesUnderHostSQL);
    hu.setParam(parentHost.getIdentifier());
    return new java.util.ArrayList<com.dotmarketing.portlets.templates.model.Template>(new java.util.HashSet<com.dotmarketing.portlets.templates.model.Template>(hu.list()));
}