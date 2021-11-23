private void processContacts(long userId, java.lang.String mobile, java.lang.String name) {
    try {
        if ((cn.momia.service.base.util.MobileUtil.isInvalidMobile(mobile)) || (org.apache.commons.lang3.StringUtils.isBlank(name)))
            return ;
        
        userServiceApi.USER.processContacts(userId, mobile, name);
    } catch (java.lang.Exception e) {
        cn.momia.service.deal.web.ctrl.OrderController.LOGGER.error("error occurred during process contacts {}/{}", mobile, name);
    }
}