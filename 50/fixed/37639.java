public static com.example.hari.mycontacts.ContactList getContactInstance() {
    if ((com.example.hari.mycontacts.ContactList.sContactInstance) == null) {
        com.example.hari.mycontacts.ContactList.sContactInstance = new com.example.hari.mycontacts.ContactList();
    }
    return com.example.hari.mycontacts.ContactList.sContactInstance;
}