@java.lang.Override
public void info(@javax.annotation.Nonnull
java.lang.Object msg, @javax.annotation.Nonnull
java.lang.Throwable t) {
    if (org.apache.log4j.Level.INFO.isGreaterOrEqual(level)) {
        java.lang.System.out.println(("[INFO]\t" + (wrapMsg(msg))));
        t.printStackTrace();
    }
}