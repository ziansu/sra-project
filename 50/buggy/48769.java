public <T extends cn.liutils.cgui.gui.event.GuiEvent> void unlisten(java.lang.Class<? extends cn.liutils.cgui.gui.event.GuiEvent> clazz, cn.liutils.cgui.gui.event.IGuiEventHandler<T> handler) {
    getRawList(clazz).remove(new cn.liutils.cgui.gui.event.GuiEventBus.GuiHandlerNode(handler, 0));
}