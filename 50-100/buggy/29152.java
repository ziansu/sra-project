public void onToolbarOffsetListener(int offset, int totalOffset) {
    if (offset == 0)
        return ;
    
    int value = ((int) (((posterMaxOffset) * (((float) (java.lang.Math.abs(offset))) / totalOffset)) - ((posterMaxOffset) / 2)));
    ivPoster.setY(value);
    timber.log.Timber.d(((offset + " ") + value));
}