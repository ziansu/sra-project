private void report(int status, java.lang.String message, java.awt.image.BufferedImage image) {
    fp.forevo.manager.Conf.setTestStatus(status);
    java.lang.StackTraceElement[] thread = java.lang.Thread.currentThread().getStackTrace();
    java.lang.String methodName = thread[((thread.length) - 3)].getMethodName();
    if (fp.forevo.manager.Conf.isDbLog())
        logDatabaseMessage(methodName, status, message, image);
    
    if (fp.forevo.manager.Conf.isRobotLog())
        logLocalMessage(methodName, status, message, image);
    
}