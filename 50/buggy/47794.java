@java.lang.Override
public void debug(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (org.apache.log4j.Level.DEBUG.isGreaterOrEqual(level)) {
        java.lang.System.out.println(("[DEBUG]\t" + (wrapMsg(msg))));
    }
}