@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.mmontes.model.entity.UserAccount> findUserAccountsByFBUserIDs(java.util.List<java.lang.Long> FBUserIDs) {
    if ((FBUserIDs == null) || (FBUserIDs.isEmpty())) {
        return new java.util.ArrayList<>();
    }
    java.lang.String friendFBIds = com.mmontes.model.util.QueryUtils.getINvalues(FBUserIDs);
    java.lang.String queryString = "SELECT ua FROM UserAccount ua WHERE ua.facebookUserId IN " + friendFBIds;
    return ((java.util.List<com.mmontes.model.entity.UserAccount>) (getSession().createQuery(queryString).list()));
}