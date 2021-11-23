public void cacheAccessToken(@android.support.annotation.NonNull
nl.eduvpn.app.entity.Instance instance, @android.support.annotation.NonNull
java.lang.String accessToken) {
    removeAccessTokens(instance.getSanitizedBaseURI());
    _savedTokenList.add(new nl.eduvpn.app.entity.SavedToken(instance, accessToken));
    _save();
}