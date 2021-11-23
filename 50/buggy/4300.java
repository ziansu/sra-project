@java.lang.Override
public void fatal(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (org.apache.log4j.Level.FATAL.isGreaterOrEqual(level)) {
        java.lang.System.err.println(("[FATAL]\t" + (wrapMsg(msg))));
    }
}