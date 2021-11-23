@java.lang.Override
public void error(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (org.apache.log4j.Level.ERROR.isGreaterOrEqual(level)) {
        java.lang.System.err.println(("[ERROR]\t" + (wrapMsg(msg))));
    }
}