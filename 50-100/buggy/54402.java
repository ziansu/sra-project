public boolean isValid() {
    if (((startTime) != null) && ((endTime) != null)) {
        type = com.equinox.Todo.TYPE.EVENT;
        if (startTime.isBefore(endTime)) {
            return false;
        }
    }else
        if (((startTime) == null) && ((endTime) != null)) {
            type = com.equinox.Todo.TYPE.DEADLINE;
        }else
            if (((startTime) == null) && ((endTime) == null)) {
                type = com.equinox.Todo.TYPE.TASK;
            }
        
    
    return true;
}