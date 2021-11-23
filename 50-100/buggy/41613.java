@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Adds a video view and starts playing the fileName", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "fileName" })
public org.protocoderrunner.apprunner.api.widgets.PVideo newVideo(final java.lang.String videoFile) {
    initializeLayout();
    final org.protocoderrunner.apprunner.api.widgets.PVideo video = new org.protocoderrunner.apprunner.api.widgets.PVideo(getContext());
    video.addListener(new org.protocoderrunner.fragments.CustomVideoTextureView.VideoListener() {
        @java.lang.Override
        public void onTimeUpdate(int ms, int totalDuration) {
        }

        @java.lang.Override
        public void onReady(boolean ready) {
            video.loadExternalVideo((((org.protocoderrunner.apprunner.AppRunnerSettings.get().project.getStoragePath()) + (java.io.File.separator)) + videoFile));
        }

        @java.lang.Override
        public void onFinish(boolean finished) {
        }
    });
    return video;
}