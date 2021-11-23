public com.vk.tottenham.vk.model.PhotoDescription downloadPhoto(java.lang.String href, java.lang.String albumId, boolean isTestMode, java.lang.String description, boolean useMainGroup) {
    java.lang.String groupId = (useMainGroup) ? vkContext.getGroupId(isTestMode) : vkContext.getMediaGroupId(isTestMode);
    java.lang.String uploadUrl = vkGateway.getUploadServer(groupId, albumId);
    java.lang.String imageId = getImageId(href);
    return uploadPhoto(href, imageId, uploadUrl, albumId, groupId, description);
}