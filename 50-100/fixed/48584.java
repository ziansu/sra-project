public java.awt.image.VolatileImage retrieveFromCache(@lombok.NonNull
final com.valkryst.VTerminal.AsciiCharacter character) {
    final int hash = character.getCacheHash();
    java.awt.image.VolatileImage image = cachedImages.getIfPresent(hash);
    if ((image == null) || (image.contentsLost())) {
        java.awt.image.BufferedImage bufferedImage;
        bufferedImage = com.valkryst.VTerminal.misc.ColoredImageCache.applyColorSwap(character, font);
        bufferedImage = com.valkryst.VTerminal.misc.ColoredImageCache.applyFlips(character, font, bufferedImage);
        image = com.valkryst.VTerminal.misc.ColoredImageCache.convertToVolatileImage(bufferedImage);
        cachedImages.put(hash, image);
    }
    return image;
}