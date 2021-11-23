@java.lang.Override
public void addComponent(org.magic.game.gui.components.DisplayableCard i) {
    if (i.getMagicCard().getSubtypes().contains("Aura")) {
        java.lang.System.out.println(((("attach " + i) + "to ") + (this)));
        getAttachedCards().add(i);
    }
    ((org.magic.game.gui.components.DraggablePanel) (getParent())).addComponent(i);
}