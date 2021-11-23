@org.junit.Test
public void testDeleteButtonNoSelection() {
    gui.refreshAddressBook(addressBook1);
    gui.nameList.clearSelection();
    gui.deleteButton.setEnabled(true);
    gui.deleteButton.doClick();
    org.junit.Assert.assertEquals("Nobody should be deleted from address book", addressBook1.getPersons().size(), gui.getAddressBook().getPersons().size());
}