java.lang.String updateContact(int number, java.lang.String updatedField) {
    switch (number) {
        case 1 :
            contact.setFirstName(updatedField);
        case 2 :
            contact.setLastName(updatedField);
        case 3 :
            contact.setAddress(updatedField);
        case 4 :
            contact.setCity(updatedField);
        case 5 :
            contact.setPostCode(updatedField);
        case 6 :
            contact.setPhoneNumber(updatedField);
    }
    return selectField(number);
}