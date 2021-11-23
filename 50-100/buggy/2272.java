private static java.util.Optional<java.net.URL> getBaseImageURL(final java.lang.String baseImageName, final games.strategy.engine.data.PlayerID id, final games.strategy.triplea.ResourceLoader resourceLoader) {
    final java.lang.String fileName = ((((games.strategy.triplea.image.UnitImageFactory.FILE_NAME_BASE) + (id.getName())) + "/") + baseImageName) + ".png";
    final java.net.URL url = resourceLoader.getResource(fileName);
    if (url == null) {
        games.strategy.debug.ClientLogger.logError(((("MISSING IMAGE (this unit or image will be invisible): " + baseImageName) + "  looking in: ") + fileName));
    }
    return java.util.Optional.ofNullable(url);
}