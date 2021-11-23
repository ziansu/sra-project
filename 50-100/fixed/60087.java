int getWidthOffset(int offsetImage) {
    if (offsetImage == (CompareImages.ImageComparator.Offset.FIRST_IMAGE)) {
        if (((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.LeftUp)) || ((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.LeftDown))) {
            return widthOffset;
        }
    }else
        if (offsetImage == (CompareImages.ImageComparator.Offset.SECOND_IMAGE)) {
            if (((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.RightDown)) || ((offsetDirection) == (CompareImages.ImageComparator.OffsetDirection.RightUp))) {
                return widthOffset;
            }
        }
    
    return 0;
}