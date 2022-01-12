@org.openqa.selenium.Beta
public org.openqa.selenium.logging.Logs logs() {
    return new org.openqa.selenium.remote.RemoteLogs(getExecuteMethod());
}