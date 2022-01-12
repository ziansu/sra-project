@java.lang.Override
public void streamingStarted(com.vaadin.server.StreamVariable.StreamingStartEvent event) {
    if (!(uploadQueue.isEmpty())) {
        if ((!(isValidFileSize(event))) || (!(isValidMimeType(event)))) {
            return ;
        }
        currentUploadingLayout.startStreaming(uploadQueue.get(0));
        show();
        if ((startedHandler) != null) {
            startedHandler.handleUploadStarted();
        }
    }
}