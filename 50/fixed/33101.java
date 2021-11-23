private application.backend.Feedback setStorageLocationToPrevious() throws java.io.IOException {
    storageConnector.setDirectory(prevLocation);
    application.backend.Feedback feedback = new application.backend.Feedback(((application.backend.ChangeStorageLocation.MESSAGE_UNDO_CHANGE) + (prevLocation)), storageConnector.getOpenList(), null);
    feedback.setCalFlag();
    return feedback;
}