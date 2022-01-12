public boolean isAnonymous() {
    return ((getId()) != null) && (getId().equals(com.stratelia.webactiv.beans.admin.UserDetail.getAnonymousUserId()));
}