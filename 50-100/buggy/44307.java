@java.lang.Override
public org.geotoolkit.image.io.large.TileRasterCache put(java.awt.Point key, org.geotoolkit.image.io.large.TileRasterCache value) {
    final org.geotoolkit.image.io.large.TileRasterCache last = super.put(key, value);
    if (last != null)
        usedCapacity.addAndGet((-(last.getWeight())));
    
    if (value != null)
        usedCapacity.addAndGet((-(value.getWeight())));
    
    return last;
}