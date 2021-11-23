private boolean isPointNearStackTop(java.util.Stack<app.utils.helper.Point> path, app.utils.helper.Point target) {
    int distance = 0;
    java.util.Stack<app.utils.helper.Point> pathClone = clonePointStack(path);
    while (!(pathClone.empty())) {
        if (distance > 1)
            return false;
        else
            if ((pathClone.pop().equals(target)) && (distance <= 1))
                return true;
            else
                distance++;
            
        
    } 
    return false;
}