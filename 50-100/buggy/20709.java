@org.junit.Test
public void testPixelIterator() {
    java.lang.Iterable<anuled.dynamicstore.TileReader.Pixel> iter = reader.pixels();
    int numPixels = 0;
    for (@java.lang.SuppressWarnings(value = "unused")
    anuled.dynamicstore.TileReader.Pixel pixel : iter) {
        numPixels += 1;
    }
    assert numPixels == ((anuled.dynamicstore.TestTileReader.TRUE_HEIGHT) * (anuled.dynamicstore.TestTileReader.TRUE_WIDTH));
}