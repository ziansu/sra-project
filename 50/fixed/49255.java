@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (!(mCards.isEmpty())) {
        android.view.View card = mCards.getFirst();
        mMyTouchListener.onTouch(card, ev);
    }
    return super.onInterceptTouchEvent(ev);
}