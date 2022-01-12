private void doDestroy(boolean success) throws java.lang.Exception {
    java.lang.ClassLoader oldClassLoader = co.cask.cdap.common.lang.ClassLoaders.setContextClassLoader(job.getConfiguration().getClassLoader());
    try {
        if ((mapReduce) instanceof co.cask.cdap.api.ProgramLifecycle) {
            ((co.cask.cdap.api.ProgramLifecycle) (mapReduce)).destroy();
        }else {
            mapReduce.onFinish(success, context);
        }
    } finally {
        co.cask.cdap.common.lang.ClassLoaders.setContextClassLoader(oldClassLoader);
    }
}