public static boolean checkForItem(byui.cit260.fireSwamp.model.Location location) {
    if ((location.getItem()) == null) {
        return false;
    }else {
        return (location.getItem().getItemType()) != (byui.cit260.fireSwamp.enums.ItemType.NONE);
    }
}