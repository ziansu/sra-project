public void modify(my.javapr.addressbook.model.ContactData contact) {
    initContactModificationById(contact.getId());
    fillContactForm(contact, true);
    submitContactModification();
    returnToHomePage();
}