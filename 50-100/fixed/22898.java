private void setThumbPositionByProgress(int currentProgress) {
    if (currentProgress == 0) {
        thumbPos = halfThumbWidth;
        return ;
    }
    if (currentProgress == (maxProgress)) {
        thumbPos = (width) - (halfThumbWidth);
        return ;
    }
    thumbPos = ((float) ((((currentProgress * 1.0) / (maxProgress)) * ((width) - (thumb.getWidth()))) + (halfThumbWidth)));
    int a = 0;
}