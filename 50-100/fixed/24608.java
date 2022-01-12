@pt.ist.fenixframework.Atomic(mode = pt.ist.fenixframework.Atomic.TxMode.WRITE)
private void sendEmailNotification(java.lang.String email, java.lang.String link) {
    java.lang.String title = org.fenixedu.bennu.core.i18n.BundleUtil.getString(pt.ist.registration.process.ui.service.SignCertAndStoreService.RESOURCE_BUNDLE, "registration.document.email.title");
    java.lang.String body = org.fenixedu.bennu.core.i18n.BundleUtil.getString(pt.ist.registration.process.ui.service.SignCertAndStoreService.RESOURCE_BUNDLE, "registration.document.email.body", link);
    org.fenixedu.academic.domain.util.email.SystemSender systemSender = org.fenixedu.bennu.core.domain.Bennu.getInstance().getSystemSender();
    new org.fenixedu.academic.domain.util.email.Message(systemSender, systemSender.getConcreteReplyTos(), java.util.Collections.EMPTY_LIST, title, body, email);
}