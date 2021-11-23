@java.lang.Override
public void run() {
    org.matrix.matrixandroidsdk.activity.CommonActivityUtils.goToRoomPage(null, this.mAutomaticallyOpenedRoomId, this, mOpenedRoomIntent);
    this.mAutomaticallyOpenedRoomId = null;
    this.mOpenedRoomIntent = null;
}