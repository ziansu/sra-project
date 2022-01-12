@java.lang.Override
public java.lang.String getMessage() {
    if (((path) == null) || ((path) == "")) {
        return "KeeperErrorCode = " + (org.apache.zookeeper.KeeperException.getCodeMessage(code));
    }
    return (("KeeperErrorCode = " + (org.apache.zookeeper.KeeperException.getCodeMessage(code))) + " for ") + (path);
}