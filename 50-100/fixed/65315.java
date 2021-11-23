@java.lang.Override
public A getAction(A action, int index) {
    A retValue = null;
    if (actions.contains(action)) {
        int indexOf = actions.indexOf(action);
        indexOf += index;
        if ((indexOf >= 0) && (indexOf < (actions.size()))) {
            retValue = actions.get(indexOf);
        }
    }
    return retValue;
}