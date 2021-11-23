@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public java.util.List getAssignments(final java.lang.Long gradebookId, final org.sakaiproject.service.gradebook.shared.SortType sortBy, final boolean ascending) {
    return ((java.util.List) (getHibernateTemplate().execute(new org.springframework.orm.hibernate3.HibernateCallback() {
        public java.lang.Object doInHibernate(org.hibernate.Session session) throws org.hibernate.HibernateException {
            java.util.List assignments = getAssignments(gradebookId, session);
            sortAssignments(assignments, sortBy, ascending);
            return assignments;
        }
    })));
}