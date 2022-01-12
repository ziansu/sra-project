private long writeJobOutputResource(java.lang.String path, com.kylinolap.job2.dao.JobOutputPO output) throws java.io.IOException {
    return store.putResource(path, output, com.kylinolap.job2.dao.JobDao.JOB_OUTPUT_SERIALIZER);
}