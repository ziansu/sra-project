public void remove(int selectedIndex) {
    getList().remove(selectedIndex);
    lock.MySQL.deleteSpecificUser(table, users[selectedIndex].getID());
    gui.updateList();
    gui.showTextUser((("User: " + (users[selectedIndex].getName())) + "\nhas been removed."));
}