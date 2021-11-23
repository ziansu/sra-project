private void privateConstructor(android.content.Context context) {
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}