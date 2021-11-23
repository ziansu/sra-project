public void setIObject(edu.wpi.cs.lmp.objects.IObject obj) {
    if (((!(isResizing)) && (obj == null)) && ((!(isRotating)) && (obj == null))) {
        unbindRequest = false;
        this.obj = obj;
    }else
        if (((isResizing) && (obj == null)) || ((isRotating) && (obj == null))) {
            unbindRequest = true;
        }else {
            unbindRequest = false;
            this.obj = obj;
        }
    
}