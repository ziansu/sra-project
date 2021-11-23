public boolean setController(nl.tudelft.contextproject.controller.Controller c) {
    if ((c != (controller)) && (c != null)) {
        if ((controller) != null) {
            getStateManager().detach(controller);
        }
        controller = c;
        getStateManager().attach(controller);
        return true;
    }
    return false;
}