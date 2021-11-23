@java.lang.Override
public anuled.dynamicstore.TileReader.Pixel next() {
    anuled.dynamicstore.TileReader.Pixel pixel = new anuled.dynamicstore.TileReader.Pixel(row, col);
    if ((row) < (pixelWidth))
        (row)++;
    else
        row = 0;
    
    (col)++;
    return pixel;
}