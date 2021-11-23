@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    switch (qName) {
        case "first-name" :
            person.setFirstName(content);
            break;
        case "last-name" :
            person.setLastName(content);
            break;
        case "person-phone" :
            com.epam.university.java.core.task034.PhoneNumber phoneNumber = new com.epam.university.java.core.task034.PhoneNumberImpl(content);
            phoneNumbers.add(phoneNumber);
            break;
        case "person-phones" :
            person.setPhoneNumbers(phoneNumbers);
            break;
        default :
            break;
    }
}