@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.genepattern.junitutil.DbUtil.initDb();
    jobDir = org.genepattern.junitutil.FileUtil.getDataFile((("jobResults/" + (gpJobNo)) + "/"));
    jobContext = new org.genepattern.server.config.GpContext.Builder().userId(userId).jobNumber(gpJobNo).build();
    jobRunnerDao = mock(org.genepattern.server.executor.drm.dao.JobRunnerJobDao.class);
    jobOutputDao = mock(org.genepattern.server.job.output.dao.JobOutputDao.class);
}