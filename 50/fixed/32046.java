public void close() throws tollbooth.TollboothException {
    if (!(controller.isOpen())) {
        return ;
    }
    this.actionDispatch(controller, tollbooth.TollGate.Action.CLOSE);
}