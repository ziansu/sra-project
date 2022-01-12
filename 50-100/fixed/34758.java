public static com.alangpierce.lambdacalculusplayground.geometry.Point getScreenPos(android.view.View view) {
    final int[] location = new int[]{ 0 , 0 };
    view.getLocationOnScreen(location);
    if (((location[0]) == 0) && ((location[1]) == 0)) {
        throw new java.lang.IllegalStateException(((("Cannot accurately compute the screen position for " + "view ") + view) + " because it is not on the screen."));
    }
    return com.alangpierce.lambdacalculusplayground.geometry.Point.create(location[0], location[1]);
}