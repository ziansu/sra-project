@java.lang.Override
public java.lang.String doEdit() throws java.lang.Exception {
    final com.atlassian.confluence.user.ConfluenceUser user = getUser();
    final org.echocat.adam.profile.Profile profile = (user != null) ? org.echocat.adam.profile.ProfileProvider.profileProvider().provideFor(user) : null;
    final java.lang.String result = super.doEdit();
    if ("success".equals(result)) {
        updateFields(profile);
        profile.reIndex();
    }
    return result;
}