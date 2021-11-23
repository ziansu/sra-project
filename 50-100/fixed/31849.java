@java.lang.Override
public java.util.List<org.craftercms.profile.api.services.ProfileAttachment> getProfileAttachments(final java.lang.String profileId) throws org.craftercms.profile.api.exceptions.ProfileException {
    org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> params = createBaseParams();
    java.lang.String url = getAbsoluteUrl(((BASE_URL_PROFILE) + (URL_PROFILE_GET_ATTACHMENTS)));
    url = addQueryParams(url, params, false);
    return doGetForObject(url, org.craftercms.profile.services.impl.ProfileServiceRestClient.profileAttachmentListTypeRef, profileId);
}