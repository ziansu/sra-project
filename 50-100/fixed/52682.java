@java.lang.Override
public boolean droppingMaterial() {
    if ((request) != null) {
        if ((request.isActive()) && (request.getPos().equals(movable.getPos()))) {
            request.deliveryFulfilled();
            request = null;
            return false;
        }else {
            request.deliveryAborted();
            request = null;
        }
    }
    return true;
}