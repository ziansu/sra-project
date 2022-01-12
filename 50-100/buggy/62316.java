public void setupSpecialSprite(final int x, final int y) {
    this.specialSprite = new javafx.scene.image.ImageView(new javafx.scene.image.Image(actor.Mothership.IMAGESRC));
    specialSprite.setX((x - 15));
    specialSprite.setY((y - 15));
    specialSprite.setFitWidth(30);
    specialSprite.setPreserveRatio(true);
}