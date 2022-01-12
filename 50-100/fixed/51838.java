@java.lang.Override
public void deletePhoneNumber(java.lang.String phoneNumber) {
    for (ru.kpecmuk.phone_book.I_Contact contact : this.contacts.values()) {
        for (ru.kpecmuk.phone_book.I_PhoneNumber phone : contact.getPhoneNumberMap().values()) {
            if (phoneNumber.equals(phone.getPhoneNumber())) {
                contact.getPhoneNumberMap().remove(phone.getID());
                break;
            }
        }
    }
}