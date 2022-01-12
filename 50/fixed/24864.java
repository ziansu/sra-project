public org.sakaiproject.tool.gradebook.Gradebook getGradebook(java.lang.Long id) {
    return ((org.sakaiproject.tool.gradebook.Gradebook) (getHibernateTemplate().load(org.sakaiproject.tool.gradebook.Gradebook.class, id)));
}