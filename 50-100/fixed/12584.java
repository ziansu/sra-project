@java.lang.Override
public void run() {
    try {
        executable.execute(context);
    } catch (com.kylinolap.job2.exception.ExecuteException e) {
        logger.error(("ExecuteException job:" + (executable.getId())), e);
    } catch (java.lang.Exception e) {
        logger.error(("unknown error execute job:" + (executable.getId())), e);
    } finally {
        context.removeRunningJob(executable);
    }
}