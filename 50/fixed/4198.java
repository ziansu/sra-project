@pt.ist.fenixframework.Atomic
private void createMenu(org.fenixedu.cms.domain.Site site, org.fenixedu.commons.i18n.LocalizedString name) {
    org.fenixedu.cms.domain.Menu p = new org.fenixedu.cms.domain.Menu(site);
    p.setName(name);
}