@java.lang.Override
public void run() {
    if (com.studygoal.jisc.Managers.NetworkManager.getInstance().updateProfileImage(imagePath)) {
        this.runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                settings_fragment.refresh_image();
                hideProgressBar();
            }
        });
    }
    this.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            hideProgressBar();
        }
    });
}