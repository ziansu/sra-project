public int openItemMenu(java.util.ArrayList<Model.Item> items, Control.PlayerControls playerControls) {
    if (!(displayInventory(items)))
        return -1;
    
    int choice = getInput(items.size());
    if (choice > 0) {
        doAction(items.get(choice), playerControls);
        return 1;
    }else {
        return -1;
    }
}