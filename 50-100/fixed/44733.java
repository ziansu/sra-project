public void updateImage() {
    if ((myImage) == null) {
        return ;
    }
    double centerX = myHitbox.getCenterX();
    double centerY = myHitbox.getCenterY();
    myImage.setX((centerX - ((myImage.getBoundsInParent().getWidth()) / 2)));
    myImage.setY((centerY - ((myImage.getBoundsInParent().getHeight()) / 2)));
}