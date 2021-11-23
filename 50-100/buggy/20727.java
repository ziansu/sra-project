@java.lang.Override
public void onGazeUpdate(com.theeyetribe.clientsdk.data.GazeData gazeData) {
    javafx.application.Platform.runLater(() -> {
        com.theeyetribe.javafx.utils.GazeFrameCache.getInstance().update(gazeData);
        if (!(mIsRecievingFrames)) {
            if (null != (progress)) {
                progress.setVisible(false);
                mCalibPadding = (innerRoot.getWidth()) * 0.075F;
                resetCalibration();
                mIsRecievingFrames = true;
            }
        }
    });
}