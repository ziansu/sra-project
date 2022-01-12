processing.javafx.PGraphicsFX2D.FontInfo get(java.lang.String name, float size) {
    if (nonNativeNames.contains(name)) {
        size = 0;
    }
    retrievingKey.name = name;
    retrievingKey.size = size;
    return cache.get(retrievingKey);
}