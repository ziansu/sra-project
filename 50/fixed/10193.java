@java.lang.Override
public synchronized void deleteEvent(seedu.address.model.event.ReadOnlyEvent event) throws seedu.address.model.person.exceptions.EventNotFoundException {
    addressBook.removeEvent(event);
    indicateAddressBookChanged();
}