@java.lang.Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawDefaultBackground();
    this.oldMouseX = ((float) (mouseX));
    this.oldMouseY = ((float) (mouseY));
    super.drawScreen(mouseX, mouseY, partialTicks);
    this.renderHoveredToolTip(mouseX, mouseY);
}