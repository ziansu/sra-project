public android.graphics.Paint chooseRandomColor(android.graphics.Paint paint) {
    int randNum = (r.nextInt((3 - 0))) + 0;
    if (randNum == 1) {
        paint.setColor(Color.RED);
    }else
        if (randNum == 2) {
            paint.setColor(Color.BLUE);
        }else {
            paint.setColor(Color.MAGENTA);
        }
    
    return paint;
}