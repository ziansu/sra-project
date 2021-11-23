@java.lang.Override
public void error(@javax.annotation.Nonnull
java.lang.Object msg) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.ERROR)) {
        java.lang.System.err.println(("[ERROR]\t" + (wrapMsg(msg))));
    }
}