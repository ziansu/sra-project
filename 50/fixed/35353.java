@java.lang.Override
public void run() {
    try {
        loadEnvironment(environmentId);
    } catch (io.subutai.common.environment.EnvironmentNotFoundException e) {
        notifyOnEnvironmentDestroyed(environmentId);
    }
    removeActiveWorkflow(environmentId);
}