@java.lang.Override
public void clear() {
    this.myIP = null;
    setMyPortIsSet(false);
    this.myPort = 0;
    setMyClusterIDIsSet(false);
    this.myClusterID = 0;
    this.entries = null;
}