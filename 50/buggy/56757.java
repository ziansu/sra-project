public void restoreFromImageData(org.techteam.decider.content.question.ImageData imageData) {
    imageHolder.setSource(imageData.getOriginalUri());
    imageHolder.setPreview(imageData.getPreviewUri());
    showImage();
}