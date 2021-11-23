@java.lang.Override
public void buildFinished(org.gradle.BuildResult result) {
    listenerManager.removeListener(daemonExpirationListener);
}