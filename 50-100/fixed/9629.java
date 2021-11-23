public org.exoplatform.portal.gadget.core.GadgetToken removeToken(org.apache.shindig.gadgets.oauth.BasicOAuthStoreTokenIndex tokenKey) {
    java.util.Map<java.lang.String, org.exoplatform.portal.gadget.core.GadgetTokenEntry> tokens = getGadgetTokens();
    for (org.exoplatform.portal.gadget.core.GadgetTokenEntry tokenEntry : tokens.values()) {
        org.apache.shindig.gadgets.oauth.BasicOAuthStoreTokenIndex key = tokenEntry.getKey();
        if (tokenKey.equals(key)) {
            org.exoplatform.portal.gadget.core.GadgetToken token = tokenEntry.getToken();
            tokenEntry.remove();
            return token;
        }
    }
    return null;
}