@java.lang.Override
public void handleTouch(com.jadenball.grapheditor.GraphViewController c, android.view.MotionEvent event) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_UP :
            c.model.createVertex(event.getX(), event.getY());
            c.notifySubscribers();
            c.state = new com.jadenball.grapheditor.InputReadyState();
            break;
        case android.view.MotionEvent.ACTION_MOVE :
            c.state = new com.jadenball.grapheditor.InputMoveState();
            break;
    }
}