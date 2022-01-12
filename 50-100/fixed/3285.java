@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((com.example.alex.parkinsonsdiseaseapp.Circle.recordflag) == 1) {
        distance(event.getX(), event.getY());
        if (isInsideCircle(event.getX(), event.getY())) {
            (com.example.alex.parkinsonsdiseaseapp.Circle.numCorrect)++;
            generateRandom();
            invalidate();
        }
    }
    return super.onTouchEvent(event);
}