public int compare(com.ob.dailyReport.model.ProjectReport projectReport1, com.ob.dailyReport.model.ProjectReport projectReport2) {
    java.lang.String name1 = projectReport1.getProjectName();
    java.lang.String name2 = projectReport2.getProjectName();
    com.ob.dailyReport.model.Project project1;
    try {
        project1 = com.ob.dailyReport.dao.ProjectDao.getProject(name1, team);
        com.ob.dailyReport.model.Project project2 = com.ob.dailyReport.dao.ProjectDao.getProject(name2, team);
        return java.lang.Integer.compare(project1.getLevel(), project2.getLevel());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return 0;
}