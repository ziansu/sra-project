public void setDefaultRoomSize(int size) {
    if ((size % (rasterSize)) != 0) {
        throw new java.lang.IllegalArgumentException(ZLocalization.loc.getString("ds.z.DefaultEvacuationFloor.RoomSizeRasterException"));
    }
    if ((size < (defaultRoomSize)) && (normalMode)) {
        throw new java.lang.IllegalArgumentException(ZLocalization.loc.getString("ds.z.DefaultEvacuationFloor.DefaultRoomSizeDecreasedException"));
    }
    defaultRoomSize = size;
}