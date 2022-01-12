@java.lang.Override
public void drawOpen(final controller.IController controller) {
    if ((controller.getDiscardPile().size()) > 0) {
        controller.drawOpenCard();
    }
}