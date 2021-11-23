private void moveThumb(com.edmodo.rangebar.Thumb thumb, float x) {
    if ((x < (mBar.getLeftX())) || (x > (mBar.getRightX()))) {
    }else {
        thumb.setX(x);
        invalidate();
    }
}