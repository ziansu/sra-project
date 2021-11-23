private void remove(int index) {
    bibliothek.gui.dock.action.DockAction action = actions.remove(index);
    bibliothek.gui.dock.themes.basic.action.DropDownItemHandle item = items.remove(action);
    if (item != null) {
        item.unbind();
        menu.remove(item.getView().getItem());
    }
}