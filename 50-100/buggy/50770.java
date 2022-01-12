public static boolean isCommentOwner(java.lang.String openIdToken, de.rwth.dbis.layers.lapps.entity.Comment comment) {
    if (openIdToken == null) {
        return false;
    }
    if (openIdToken.equals(de.rwth.dbis.layers.lapps.authenticate.OIDCAuthentication.OPEN_ID_TEST_TOKEN)) {
        return true;
    }
    try {
        de.rwth.dbis.layers.lapps.entity.User user = de.rwth.dbis.layers.lapps.authenticate.OIDCAuthentication.authenticate(openIdToken);
        if (comment.getUser().getOidcId().equals(user.getOidcId())) {
            return true;
        }else {
            return false;
        }
    } catch (de.rwth.dbis.layers.lapps.exception.OIDCException e) {
        return false;
    }
}