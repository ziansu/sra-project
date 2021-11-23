public com.nimbits.client.model.user.User getAdmin() {
    final java.lang.String adminStr = settingsService.getSetting(ServerSetting.admin);
    if (org.apache.commons.lang3.StringUtils.isEmpty(adminStr)) {
        throw new java.lang.IllegalArgumentException("Server is missing admin setting!");
    }else {
        return new com.nimbits.client.model.user.UserModel.Builder().name(com.nimbits.client.model.common.impl.CommonFactory.createName(adminStr, EntityType.user)).id(adminStr).email(adminStr).parent(adminStr).isAdmin(true).create();
    }
}