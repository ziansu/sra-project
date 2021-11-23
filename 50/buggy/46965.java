public void hangup() {
    if ((com.dialogic.msmltool.App.call) != null) {
        com.dialogic.msmltool.App.call.createBye();
        com.dialogic.msmltool.App.hangup = true;
    }
}