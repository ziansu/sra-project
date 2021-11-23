public void remove(int selectedIndex) {
    gui.showTextUser((("User: " + (users[selectedIndex].getName())) + "\nhas been removed."));
    getList().remove(selectedIndex);
    lock.MySQL.deleteSpecificUser(table, users[selectedIndex].getID());
    gui.updateList();
}