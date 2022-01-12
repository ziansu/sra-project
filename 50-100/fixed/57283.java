@java.lang.Override
public void cheatActivated(java.lang.String cheatName) {
    if (cheatName.equals(CheatCodes.KONAMI_CODE)) {
        java.util.ArrayList<java.awt.image.BufferedImage> konamiImages = Game.Model.Resources.ResourceImages.getAllImagesFromDirectory(ResourceImages.ANIME_DIRECTORY_PATH);
        if (konamiImages != null) {
            tileImages = konamiImages;
            tileImageThumbNails = Game.Model.Resources.ResourceImages.convertToThumbNails(tileImages);
            selectedtileImageIndex = (tileImages.size()) - 1;
            showTileImage();
        }
    }
}