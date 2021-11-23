public void onToolbarOffsetListener(int offset, int totalOffset) {
    int value = ((int) (((posterMaxOffset) * (((float) (java.lang.Math.abs(offset))) / totalOffset)) - ((posterMaxOffset) / 2)));
    ivPoster.setY(value);
    timber.log.Timber.d(((offset + " ") + value));
}