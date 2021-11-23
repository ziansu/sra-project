@java.lang.Override
public void act(float delta) {
    taken += delta;
    if ((taken) > (duration)) {
        callActionCompletedListener();
        if ((action) != null) {
            action.act(delta);
            if (action.isDone())
                action.callActionCompletedListener();
            
        }
    }
}