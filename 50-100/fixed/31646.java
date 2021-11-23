private void showItemAnimation(android.view.MotionEvent ev) {
    if ((preItemId) != (itemId)) {
        removeLooper(false);
        updateStairState();
    }
    switch (ev.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            mState = com.special.rhythembuttongroup.core.RhythmButtonGroup.State.DOWN;
            onStartAnimation();
            onStayAnimation();
            break;
        case android.view.MotionEvent.ACTION_MOVE :
            mState = com.special.rhythembuttongroup.core.RhythmButtonGroup.State.MOVE;
            onMoveAnimation();
            break;
        case android.view.MotionEvent.ACTION_UP :
            mState = com.special.rhythembuttongroup.core.RhythmButtonGroup.State.UP;
            removeLooper(true);
            onStayAnimation();
            onFinishAnimation();
            break;
    }
}