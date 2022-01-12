public void createRegisteredOverlays() {
    for (java.util.Map.Entry<java.lang.String, com.gildedgames.util.modules.ui.UiServices.RegisteredOverlay> entry : this.registeredOverlays.entrySet()) {
        java.lang.String uniqueSaveName = entry.getKey();
        com.gildedgames.util.modules.ui.UiServices.RegisteredOverlay overlay = entry.getValue();
        com.gildedgames.util.modules.ui.util.factory.Factory<com.gildedgames.util.modules.ui.common.GuiFrame> factory = overlay.getFactory();
        com.gildedgames.util.modules.ui.common.GuiViewer viewer = overlay.getViewer();
        net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType renderOrder = overlay.getRenderOrder();
        com.gildedgames.util.modules.ui.UiModule.locate().overlay(uniqueSaveName, factory.create(), viewer, renderOrder);
    }
}