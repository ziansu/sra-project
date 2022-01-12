private java.util.ArrayList<java.lang.String> undoRemove() {
    if (isEvent(prevModIndex)) {
        return addEvent(prevModEvent);
    }else
        if (isFloatingTask(prevModIndex)) {
            return addFloatingTask(prevModFloatingTask);
        }else {
            return addTask(prevModTask);
        }
    
}