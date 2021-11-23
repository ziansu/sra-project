@java.lang.Override
public org.craftercms.profile.api.VerificationToken getVerificationToken(java.lang.String tokenId) throws org.craftercms.profile.api.exceptions.ProfileException {
    java.lang.String url = getAbsoluteUrl(((BASE_URL_PROFILE) + (URL_PROFILE_GET_VERIFICATION_TOKEN)));
    url = addQueryParams(url, createBaseParams(), false);
    return doGetForObject(url, org.craftercms.profile.api.VerificationToken.class, tokenId);
}