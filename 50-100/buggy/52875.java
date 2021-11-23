public void onSwipeSingle(int position, int direction) {
    com.elzup.pictter.pictter.PictureStatus status = pictureStatusAdapter.getItem(position);
    pictureStatusAdapter.remove(status);
    switch (direction) {
        case com.wdullaer.swipeactionadapter.SwipeDirections.DIRECTION_NORMAL_LEFT :
        case com.wdullaer.swipeactionadapter.SwipeDirections.DIRECTION_FAR_LEFT :
            break;
        case com.wdullaer.swipeactionadapter.SwipeDirections.DIRECTION_NORMAL_RIGHT :
        case com.wdullaer.swipeactionadapter.SwipeDirections.DIRECTION_FAR_RIGHT :
            com.elzup.pictter.pictter.DeviceUtils.saveToFile(status.getImage());
            break;
    }
}