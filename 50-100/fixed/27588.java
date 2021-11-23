@java.lang.Override
public void onSuccessfulTrigger() {
    if (transcriber.isListening()) {
        transcriber.stopRecording();
        controller.onUserActivity();
        com.amazon.alexa.avs.RequestListener requestListener = new com.amazon.alexa.avs.RequestListener() {
            @java.lang.Override
            public void onRequestSuccess() {
                finishProcessing();
            }

            @java.lang.Override
            public void onRequestError(java.lang.Throwable e) {
                com.amazon.alexa.avs.AVSApp.log.error("An error occured creating speech request", e);
                finishProcessing();
            }
        };
        final com.amazon.alexa.avs.RecordingRMSListener rmsListener = this;
        this.controller.startRecording(rmsListener, requestListener);
    }else {
        this.controller.stopRecording();
    }
}