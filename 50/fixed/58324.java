@java.lang.Override
protected final UI.MenuButton newButton(int buttonIndex) {
    generic.ColorData colorData = paletteColors.get(buttonIndex);
    UI.MenuButton colorPaletteButton = newColorPaletteButton(colorData);
    colorPaletteButton.setButtonPressedFunction(colorPaletteButtonPressedFunction(colorPaletteButton));
    return colorPaletteButton;
}