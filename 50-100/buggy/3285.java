@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if ((com.example.alex.parkinsonsdiseaseapp.Circle.recordflag) == 1) {
        distance(event.getX(), event.getY());
        if (isInsideCircle(event.getX(), event.getY())) {
            generateRandom();
            invalidate();
            (com.example.alex.parkinsonsdiseaseapp.Circle.numCorrect)++;
        }
    }
    return super.onTouchEvent(event);
}