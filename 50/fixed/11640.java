@java.lang.Override
public void sendNotification(org.linagora.linshare.core.domain.objects.MailContainerWithRecipient mailContainer) throws org.linagora.linshare.core.exception.BusinessException {
    this.sendNotification(com.google.common.collect.Lists.newArrayList(mailContainer), false);
}