public static images.StaticImage getKeyImg(int keyID) {
    if (keyID > 0) {
        keyID = (keyID % 4) + 1;
    }
    int itemID = (keyID - 1) + (ItemType.YELLOW_KEY.ordinal());
    return images.ImageBuilder.getItemImage(itemID);
}