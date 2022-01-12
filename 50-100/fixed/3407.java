private java.util.ArrayList<java.lang.String> undoRemove() {
    if ((prevModEvent) != null) {
        return addEvent(prevModEvent);
    }else
        if ((prevModFloatingTask) != null) {
            return addFloatingTask(prevModFloatingTask);
        }else {
            return addTask(prevModTask);
        }
    
}