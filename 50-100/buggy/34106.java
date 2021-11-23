@java.lang.Override
public java.io.InputStream getProfileAttachment(final java.lang.String attachmentId, final java.lang.String profileId) throws org.craftercms.profile.api.exceptions.ProfileException {
    org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> params = createBaseParams();
    java.lang.String url = getAbsoluteUrl(((BASE_URL_PROFILE) + (URL_PROFILE_GET_ATTACHMENT)));
    url = org.craftercms.commons.rest.RestClientUtils.addQueryParams(url, params, false);
    return new java.io.ByteArrayInputStream(doGetForObject(url, org.craftercms.profile.services.impl.ProfileServiceRestClient.byteArrayTypeRef, profileId, attachmentId));
}