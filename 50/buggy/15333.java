@java.lang.Override
public void doOnReturn(java.lang.Integer deleteCount) {
    notificationService.completeProgressNotification(notificationBean.getUuid(), i18n.format("situation.message-deleted"), i18n.format("situation.delete-result", deleteCount));
}