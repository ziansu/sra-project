public void setupSpecialSprite(final double x, final double y) {
    this.specialSprite = new javafx.scene.image.ImageView(new javafx.scene.image.Image(actor.Mothership.IMAGESRC));
    specialSprite.setX(x);
    specialSprite.setY(y);
    specialSprite.setFitWidth(30);
    specialSprite.setPreserveRatio(true);
}