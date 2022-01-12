@java.lang.Override
public void onClick() {
    contactDao.remove(item.getModelObject().getId());
    setResponsePage(org.jboss.as.quickstarts.wicketWar.pages.ListContacts.class);
}