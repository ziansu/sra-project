public static int getNumProjects() {
    final org.hibernate.Query query = edu.scripps.yates.proteindb.persistence.mysql.access.PreparedQueries.parseParametersForQuery(edu.scripps.yates.proteindb.persistence.mysql.access.PreparedQueries.NUM_PROJECTS, "project.hidden=:hidden", true);
    final java.lang.Long num = ((java.lang.Long) (query.uniqueResult()));
    return num.intValue();
}