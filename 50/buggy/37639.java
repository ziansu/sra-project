public static com.example.hari.mycontacts.ContactList getContactInstance() {
    if ((com.example.hari.mycontacts.ContactList.sContactInstance) == null) {
        new com.example.hari.mycontacts.ContactList();
    }
    return com.example.hari.mycontacts.ContactList.sContactInstance;
}