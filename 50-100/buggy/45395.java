@java.lang.Override
public org.zanata.action.DataPage<org.zanata.model.HProject> fetchPage(int startRow, int pageSize) {
    org.zanata.dao.ProjectDAO projectDAO = org.zanata.util.ServiceLocator.instance().getInstance(org.zanata.dao.ProjectDAO.class);
    try {
        java.util.List<org.zanata.model.HProject> proj = projectDAO.searchProjects(query, pageSize, startRow, includeObsolete);
        int projectSize = projectDAO.getQueryProjectSize(query, includeObsolete);
        return new org.zanata.action.DataPage<org.zanata.model.HProject>(projectSize, startRow, proj);
    } catch (org.apache.lucene.queryParser.ParseException e) {
        return null;
    }
}