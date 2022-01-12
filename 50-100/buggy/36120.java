public static void analyzeJobTask(com.heroku.syncdbs.datamover.Database db, com.heroku.syncdbs.JobMessage jm) throws com.heroku.syncdbs.datamover.DatabaseException, java.sql.SQLException {
    int jobs = jm.getTotalTasks();
    int count = com.heroku.syncdbs.JobLoggerHelper.countFinishedTasks(db, jm);
    if (count == jobs) {
        com.heroku.syncdbs.JobLoggerHelper.logJobDetailStatus(db, jm.getJobid(), jm.getTable().getFullName(), JobStatus.FINISHED, jm.getJobnum(), "");
        com.heroku.syncdbs.JobLoggerHelper.sleep();
        com.heroku.syncdbs.JobLoggerHelper.analyzeJobDetails(db, jm);
    }
}