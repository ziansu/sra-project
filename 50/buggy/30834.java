@org.springframework.transaction.annotation.Transactional
public example.app.model.Contact save(example.app.model.Contact contact) {
    org.springframework.util.Assert.notNull(contact, "Contact cannot be null");
    return getGemFireContactRepository().save(getJpaContactRepository().save(validatePhoneNumber(validateEmail(validateAddress(contact)))));
}