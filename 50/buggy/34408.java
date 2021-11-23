@java.lang.Override
public org.gradle.testkit.runner.internal.GradleRunner withDebug(boolean flag) {
    this.debug = flag;
    withDaemon((!flag));
    return this;
}