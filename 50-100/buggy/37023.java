@java.lang.Override
public org.craftercms.profile.api.services.ProfileAttachment getProfileAttachmentInformation(final java.lang.String profileId, final java.lang.String attachmentId) throws org.craftercms.profile.api.exceptions.ProfileException {
    org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> params = createBaseParams();
    java.lang.String url = getAbsoluteUrl(((BASE_URL_PROFILE) + (URL_PROFILE_GET_ATTACHMENTS_DETAILS)));
    url = org.craftercms.commons.rest.RestClientUtils.addQueryParams(url, params, false);
    return doGetForObject(url, org.craftercms.profile.api.services.ProfileAttachment.class, profileId, attachmentId);
}