public com.yalinwang.birdhunter.Arrow createArrow(android.content.res.Resources res) {
    int halfWidth = (arrowType.getWidth()) / 2;
    int height = arrowType.getHeight();
    int id = arrowType.getId();
    return new com.yalinwang.birdhunter.Arrow(new android.graphics.RectF(((xPos) - halfWidth), ((yPos) - height), ((xPos) + halfWidth), yPos), android.graphics.BitmapFactory.decodeResource(res, id), arrowType.getVelocity(), arrowType.getPower());
}