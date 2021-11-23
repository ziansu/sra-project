public static com.ambergleam.android.paperplane.model.Moon newInstance(android.content.Context context, int canvasWidth, int canvasHeight) {
    com.ambergleam.android.paperplane.model.Moon moon = new com.ambergleam.android.paperplane.model.Moon();
    moon.setBitmap(android.graphics.BitmapFactory.decodeResource(context.getResources(), R.drawable.moon));
    moon.setPosition(com.ambergleam.android.paperplane.model.Moon.getRandomStartingPosition());
    moon.setVelocity(com.ambergleam.android.paperplane.model.Moon.getRandomStartingPosition());
    return moon;
}