@java.lang.Override
public boolean matches(java.lang.Object otherEvent) {
    boolean isMatching = false;
    if (getClass().isAssignableFrom(otherEvent.getClass())) {
        org.xwiki.bridge.event.ActionExecutionEvent actionEvent = ((org.xwiki.bridge.event.ActionExecutionEvent) (otherEvent));
        isMatching = ((getActionName()) == null) || (getActionName().equals(actionEvent.getActionName()));
    }
    return isMatching;
}