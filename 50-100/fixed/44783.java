@java.lang.Override
public void draw(net.malisis.core.client.gui.GuiRenderer renderer, int mouseX, int mouseY, float partialTick) {
    if ((lastSize) != (elements.size())) {
        scrollbar.updateScrollbar();
        lastSize = elements.size();
    }
    super.draw(renderer, mouseX, mouseY, partialTick);
}