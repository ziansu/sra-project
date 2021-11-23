@org.springframework.transaction.annotation.Transactional(readOnly = false)
public void save(galvanize.form.ContactForm contactForm) {
    galvanize.entity.Contact contact = setForm(contactForm);
    getManager().save(contact);
    contactForm.setId(contact.getId());
    org.springframework.web.multipart.commons.CommonsMultipartFile pic = contactForm.getPic();
    if ((pic != null) && ((contact.getPicture()) != null)) {
        imageService.saveUpload(contact.getPicture().getId(), pic.getBytes());
    }
}