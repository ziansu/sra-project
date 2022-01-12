@org.junit.Test
public void testSortName() {
    gui.setAddressBook(addressBook1);
    gui.sortByNameButton.setEnabled(true);
    gui.sortByNameButton.doClick();
    org.junit.Assert.assertEquals("Address Book should be sorted by name", addressBook1.getPersons().get(0).getLastName(), gui.getAddressBook().getPersons().get(0).getLastName());
    org.junit.Assert.assertEquals("No item should be selected", (-1), gui.nameList.getSelectedIndex());
}