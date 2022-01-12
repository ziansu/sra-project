int getWidthOffset(int offsetImage) {
    if (((offsetImage == (CompareImages.ImageComparator.Offset.FIRST_IMAGE)) && (((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.LeftUp)) || ((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.RightDown)))) || ((offsetImage == (CompareImages.ImageComparator.Offset.SECOND_IMAGE)) && (((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.LeftDown)) || ((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.RightUp))))) {
        return widthOffset;
    }
    return 0;
}