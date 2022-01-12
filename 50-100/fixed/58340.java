void updateContact(int number, java.lang.String updatedField) {
    switch (number) {
        case 1 :
            contact.setFirstName(updatedField);
            break;
        case 2 :
            contact.setLastName(updatedField);
            break;
        case 3 :
            contact.setAddress(updatedField);
            break;
        case 4 :
            contact.setCity(updatedField);
            break;
        case 5 :
            contact.setPostCode(updatedField);
            break;
        case 6 :
            contact.setPhoneNumber(updatedField);
            break;
    }
}