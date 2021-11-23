@java.lang.Override
public void setTwitterStatus(final boolean isEnabled) {
    if (isEnabled) {
        setTwitterStatus("Twitter Feed: Connected");
    }else {
        setTwitterStatus("Twitter Feed: Disconnected");
    }
}