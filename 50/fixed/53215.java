@java.lang.Override
public void fatal(@javax.annotation.Nonnull
java.lang.Object msg, @javax.annotation.Nonnull
java.lang.Throwable t) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.FATAL)) {
        java.lang.System.err.println(("[FATAL]\t" + (wrapMsg(msg))));
        t.printStackTrace();
    }
}