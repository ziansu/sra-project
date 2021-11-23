private void moveThumb(com.edmodo.rangebar.Thumb thumb, float x) {
    if (x < (mBar.getLeftX())) {
        thumb.setX(mBar.getLeftX());
        invalidate();
    }else
        if (x > (mBar.getRightX())) {
            thumb.setX(mBar.getRightX());
            invalidate();
        }else {
            thumb.setX(x);
            invalidate();
        }
    
}