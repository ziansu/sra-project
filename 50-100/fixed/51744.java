public void crashLocalNode(java.lang.String msg, boolean produceStackTrace, java.lang.Throwable cause) {
    try {
        m_crashLocalNode.invoke(m_handler, msg, cause);
    } catch (java.lang.IllegalAccessException e) {
        error(e, "failed to crash. Forcing program exit");
        java.lang.System.exit((-1));
    } catch (java.lang.reflect.InvocationTargetException e) {
        error(e, "failed to crash. Forcing program exit");
        java.lang.System.exit((-1));
    }
}