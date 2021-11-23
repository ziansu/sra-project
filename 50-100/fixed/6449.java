@org.springframework.web.bind.annotation.RequestMapping(path = "/requests", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.util.ArrayList<tiy.invictus.ContactRequest> requests() {
    java.util.ArrayList<tiy.invictus.ContactRequest> contactRequestsList = new java.util.ArrayList<tiy.invictus.ContactRequest>();
    java.lang.Iterable<tiy.invictus.ContactRequest> allContacts = contacts.findAll();
    for (tiy.invictus.ContactRequest contactRequest : allContacts) {
        contactRequestsList.add(contactRequest);
    }
    return contactRequestsList;
}