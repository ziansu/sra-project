public static void setSelected(input.Mouse mouse) {
    for (int i = 0; i < 3; i++) {
        if (((mouse.getClicked()) && (graphics.ui.icon.UiIcons.icons[i].hoverOn())) && (graphics.ui.icon.UiIcons.allOtherIconsNotSelected(i)))
            graphics.ui.icon.UiIcons.icons[i].setSelect(true);
        
    }
}