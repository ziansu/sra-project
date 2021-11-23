private void updateVisibilityOfObject(java.lang.String objectType, int numberOfObject, boolean visible) {
    switch (objectType) {
        case "Text" :
            textHandler.setVisible(numberOfObject, visible);
            break;
        case "Image" :
            imageHandler.setVisible(numberOfObject, visible);
            break;
        case "Audio" :
            audioHandler.setVisible(numberOfObject, visible);
            break;
        case "Video" :
            videoHandler.setVisible(numberOfObject, visible);
            break;
        default :
            graphicsHandler.setVisible(numberOfObject, visible);
    }
}