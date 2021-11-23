@java.lang.Override
public void draw(com.googlecode.lanterna.gui2.TextGUIGraphics graphics) {
    graphics.applyThemeStyle(graphics.getThemeDefinition(com.googlecode.lanterna.gui2.Window.class).getNormal());
    graphics.fill(' ');
    contentHolder.draw(graphics);
    if (!(interactableLookupMap.getSize().equals(graphics.getSize()))) {
        interactableLookupMap = new com.googlecode.lanterna.gui2.InteractableLookupMap(graphics.getSize());
    }
    interactableLookupMap.reset();
    contentHolder.updateLookupMap(interactableLookupMap);
    invalid = false;
}