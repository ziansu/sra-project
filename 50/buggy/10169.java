public <T extends cn.liutils.cgui.gui.event.GuiEvent> void listen(java.lang.Class<? extends T> clazz, cn.liutils.cgui.gui.event.IGuiEventHandler<T> handler, int priority) {
    eventBus.listen(clazz, handler);
}