private boolean isStaticUtility(final java.lang.StackTraceElement s) {
    try {
        return com.sun.mail.util.logging.LogManagerProperties.isStaticUtilityClass(s.getClassName());
    } catch (java.lang.RuntimeException ignore) {
    } catch (java.lang.Exception ignore) {
    } catch (java.lang.LinkageError ignore) {
    }
    final java.lang.String cn = s.getClassName();
    return (((cn.endsWith("s")) && (!(cn.endsWith("es")))) || (cn.contains("Util"))) || (cn.endsWith("Throwables"));
}