public static com.alangpierce.lambdacalculusplayground.geometry.Point getScreenPos(android.view.View view) {
    final int[] location = new int[]{ java.lang.Integer.MIN_VALUE , java.lang.Integer.MIN_VALUE };
    view.getLocationOnScreen(location);
    if (((location[0]) == (java.lang.Integer.MIN_VALUE)) && ((location[1]) == (java.lang.Integer.MIN_VALUE))) {
        throw new java.lang.IllegalStateException(((("Cannot accurately compute the screen position for " + "view ") + view) + " because it is not on the screen."));
    }
    return com.alangpierce.lambdacalculusplayground.geometry.Point.create(location[0], location[1]);
}