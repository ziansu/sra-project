@java.lang.Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawDefaultBackground();
    super.drawScreen(mouseX, mouseY, partialTicks);
    this.oldMouseX = ((float) (mouseX));
    this.oldMouseY = ((float) (mouseY));
    this.renderHoveredToolTip(mouseX, mouseY);
}