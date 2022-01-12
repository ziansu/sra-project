public void restoreFromImageData(org.techteam.decider.content.question.ImageData imageData) {
    if (imageData == null)
        return ;
    
    imageHolder.setSource(imageData.getOriginalUri());
    imageHolder.setPreview(imageData.getPreviewUri());
    showImage();
}