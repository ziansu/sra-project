public boolean setController(nl.tudelft.contextproject.controller.Controller c) {
    if (c != (controller)) {
        if ((controller) != null) {
            getStateManager().detach(controller);
        }
        controller = c;
        if ((controller) != null) {
            getStateManager().attach(controller);
        }
        return true;
    }
    return false;
}