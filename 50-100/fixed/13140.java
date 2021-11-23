public org.jtalks.jcommune.model.entity.UserContact addContact(org.jtalks.jcommune.model.entity.UserContact userContact) {
    org.jtalks.jcommune.model.entity.JCUser user = securityService.getCurrentUser();
    org.jtalks.jcommune.model.entity.UserContactType type = null;
    try {
        type = get(userContact.getType().getId());
    } catch (org.jtalks.jcommune.service.exceptions.NotFoundException e) {
    }
    org.jtalks.jcommune.model.entity.UserContact contact = new org.jtalks.jcommune.model.entity.UserContact(userContact.getValue(), type);
    user.addContact(contact);
    return contact;
}