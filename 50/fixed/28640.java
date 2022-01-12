@java.lang.Override
public synchronized java.lang.String getNameToDisplay() {
    return localPath.substring(((localPath.lastIndexOf("/")) + 1));
}