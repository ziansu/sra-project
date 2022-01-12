private boolean isCreateEvent(java.util.List<org.hotswap.agent.command.Command> mergedCommands) {
    boolean createFound = false;
    for (org.hotswap.agent.command.Command cmd : mergedCommands) {
        org.hotswap.agent.plugin.owb.command.BeanClassRefreshCommand refreshCommand = ((org.hotswap.agent.plugin.owb.command.BeanClassRefreshCommand) (cmd));
        if (className.equals(refreshCommand.className)) {
            if ((refreshCommand.event) != null) {
                if (refreshCommand.event.getEventType().equals(FileEvent.CREATE))
                    createFound = true;
                
            }
        }
    }
    org.hotswap.agent.plugin.owb.command.BeanClassRefreshCommand.LOGGER.trace("isCreateEvent result {}: createFound={}", createFound);
    return createFound;
}