@java.lang.Override
public void initGui() {
    super.initGui();
    this.buttonList.clear();
    this.mc.displayGuiScreen(new obsidianAnimator.gui.GuiContainerChooseItem(this.mc.player, this));
}