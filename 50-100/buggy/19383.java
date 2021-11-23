@java.lang.Override
protected void onGuiEvent(jade.gui.GuiEvent ev) {
    switch (ev.getType()) {
        case de.hsb.smaevers.agent.agents.AntUiAgent.EVENT_CLOSE :
            doDelete();
            LOG.debug("Called GUI agent delete");
            try {
                getContainerController().kill();
            } catch (jade.wrapper.StaleProxyException e) {
                LOG.error(e.getMessage(), e);
            }
            break;
        default :
            break;
    }
}