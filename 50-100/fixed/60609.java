boolean checkMenuItemState(java.lang.String menuType, int index) {
    boolean result = false;
    switch (menuType) {
        case "footage" :
            result = ((controlP5.CColor) (footageMenu.getItem(index).get("color"))) == (beetracker.UIControl.menuColor);
            break;
        case "option" :
            result = ((controlP5.CColor) (optionMenu.getItem(index).get("color"))) == (beetracker.UIControl.menuColor);
            break;
        default :
    }
    return result;
}