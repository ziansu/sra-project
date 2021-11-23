private com.beautysight.liurushi.identityaccess.app.presentation.UserProfilePresentation translateToPresentationFrom(com.beautysight.liurushi.identityaccess.domain.model.User user) {
    java.lang.String originalAvatarUrl = storageService.issueDownloadUrl(user.originalAvatarKey());
    java.lang.String maxAvatarUrl = storageService.issueDownloadUrl(user.maxAvatar().key());
    return com.beautysight.liurushi.identityaccess.app.presentation.UserProfilePresentation.from(user.toUserProfile(), originalAvatarUrl, maxAvatarUrl);
}