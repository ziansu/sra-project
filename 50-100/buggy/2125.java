private boolean inRange(org.mrgeo.data.tile.TileIdWritable key) {
    if ((currentKey.compareTo(endKey)) <= 0) {
        if ((zoom) > 0) {
            final org.mrgeo.utils.TMSUtils.Tile t = org.mrgeo.utils.TMSUtils.tileid(currentKey.get(), zoom);
            if (((t.tx) >= (rowStart)) && ((t.tx) <= (rowEnd))) {
                return true;
            }
        }else {
            return true;
        }
    }
    return false;
}