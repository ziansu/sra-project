public android.content.Intent getPlayIntent(java.lang.Class<? extends android.app.Service> cutinService, long orderId, com.garlicg.cutin.appsupport.ContentOption contentOption) {
    android.content.Intent intent = new android.content.Intent(mContext, cutinService);
    intent.putExtra(ManagerUtils.EXTRA_ORDER_ID, orderId);
    com.garlicg.cutin.appsupport.ContentOption target = (contentOption != null) ? contentOption : com.garlicg.cutin.appsupport.Demo.DEFAULT_TRIGGER_INFO;
    intent.putExtra(ManagerUtils.EXTRA_TRIGGER_TYPE, target.triggerType);
    intent.putExtra(ManagerUtils.EXTRA_CONTENT_TITLE, target.contentTitle);
    intent.putExtra(ManagerUtils.EXTRA_CONTENT_MESSAGE, target.contentMessage);
    return intent;
}