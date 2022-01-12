boolean checkMenuItemState(java.lang.String menuType, int index) {
    boolean result = false;
    if (menuType.equals("footage")) {
        result = ((controlP5.CColor) (footageMenu.getItem(index).get("color"))) == (beetracker.UIControl.menuColor);
    }else
        if (menuType.equals("option")) {
            result = ((controlP5.CColor) (optionMenu.getItem(index).get("color"))) == (beetracker.UIControl.menuColor);
        }
    
    return result;
}