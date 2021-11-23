private static boolean isDisplayIndexInvalidForLastPersonListingView(int index) {
    return (index < (seedu.addressbook.AddressBook.DISPLAYED_INDEX_OFFSET)) && (index >= ((seedu.addressbook.AddressBook.latestPersonListingView.size()) + (seedu.addressbook.AddressBook.DISPLAYED_INDEX_OFFSET)));
}