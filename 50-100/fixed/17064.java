@java.lang.Override
public java.lang.String doEdit() throws java.lang.Exception {
    final java.lang.String result = super.doEdit();
    final com.atlassian.confluence.user.ConfluenceUser user = getUser();
    final org.echocat.adam.profile.Profile profile = (user != null) ? org.echocat.adam.profile.ProfileProvider.profileProvider().provideFor(user) : null;
    if ((profile != null) && ("success".equals(result))) {
        updateFields(profile);
        profile.reIndex();
    }
    return result;
}