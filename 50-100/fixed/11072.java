public void removeContact(com.addressbook.thorrism.addressbook.Contact contact, int position) {
    mBook.removeEntry(position);
    mContactHeaders.remove(position);
    mBook.saveEventually();
    contact.deleteInBackground(new com.parse.DeleteCallback() {
        @java.lang.Override
        public void done(com.parse.ParseException e) {
            if (e == null) {
                createToast("Deleted Contact");
            }else {
                e.printStackTrace();
                createToast("Failed to delete.");
            }
        }
    });
    displayList();
}