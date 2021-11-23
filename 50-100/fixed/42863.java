private void updateScript(net.alcuria.umbracraft.engine.entities.Entity entity) {
    if ((currentCommand) != null) {
        switch (currentCommand.getState()) {
            case COMPLETE :
                currentCommand.setState(CommandState.NOT_STARTED);
                currentCommand = currentCommand.getNext();
                break;
            case NOT_STARTED :
                currentCommand.start(entity);
                break;
            case STARTED :
                currentCommand.update();
                break;
            default :
                break;
        }
    }
    if ((currentCommand) == null) {
        setInactive();
        setCurrentPage(entity);
    }
}