public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        if (!(currFoucStatus)) {
            if ((bm) != null) {
                android.graphics.Bitmap fullBmp = fullHere(currX, currY, resetColor);
                if (fullBmp != null)
                    drawBmp(holder, fullBmp);
                
            }
        }else {
            nextSteps = 1;
        }
    }
    return super.onTouchEvent(event);
}