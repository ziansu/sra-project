public void setCircleColors(int[] colors, android.content.Context context) {
    java.util.List<java.lang.Integer> colorsList = circleColors;
    if (colorsList == null) {
        colorsList = new java.util.ArrayList<>();
    }
    colorsList.clear();
    for (int color : colors) {
        colorsList.add(context.getResources().getColor(color));
    }
    circleColors = colorsList;
}