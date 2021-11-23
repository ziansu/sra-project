@java.lang.Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawGradientRect(0, 0, this.width, this.height, (-1072689136), (-804253680));
    for (com.mcgame.scdiary.gui.util.GuiElement i : elements) {
        i.draw(partialTicks);
    }
}