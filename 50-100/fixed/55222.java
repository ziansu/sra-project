@java.lang.Override
public final java.io.OutputStream getOutputStream() {
    try {
        return view.saveUploadedFileDetails(fileName, fileSize, mimeType);
    } catch (final org.eclipse.hawkbit.repository.exception.ArtifactUploadFailedException e) {
        org.eclipse.hawkbit.ui.artifacts.upload.UploadHandler.LOG.error("Atifact upload failed {} ", e);
        failureReason = e.getMessage();
        interrupted = true;
        return new org.eclipse.hawkbit.ui.artifacts.upload.UploadHandler.NullOutputStream();
    }
}