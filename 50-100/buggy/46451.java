java.util.List<contactbook.model.Contact> turnIntoContactBook(java.util.List<java.lang.String> inputInStrings) {
    contactbook.logic.controller.ContactDeserialiser deserialiser = new contactbook.logic.controller.ContactDeserialiser();
    int stringsInOneContact = 4;
    java.util.List<contactbook.model.Contact> contactBook = new java.util.ArrayList<>();
    for (int startOfContact = 0; startOfContact <= ((inputInStrings.size()) - stringsInOneContact); startOfContact += stringsInOneContact) {
        contactBook.add(deserialiser.turnIntoContact(inputInStrings, (startOfContact + stringsInOneContact)));
    }
    return contactBook;
}