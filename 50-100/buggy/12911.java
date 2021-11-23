@java.lang.Override
public void act(float delta) {
    taken += delta;
    if ((taken) > (duration)) {
        callActionCompletedListener();
        action.act(delta);
        if (action.isDone())
            action.callActionCompletedListener();
        
    }
}