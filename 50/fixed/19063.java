@java.lang.Override
public boolean isDone() {
    if ((action) != null) {
        return ((taken) > (duration)) && (action.isDone());
    }else {
        return (taken) > (duration);
    }
}