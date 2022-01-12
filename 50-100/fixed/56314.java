@java.lang.Override
public void call(retrofit2.Response<org.gem.indo.dooit.api.responses.EmptyResponse> response) {
    org.gem.indo.dooit.models.User user = persisted.getCurrentUser();
    if (((user != null) && ((user.getProfile()) != null)) && ((getImageUri()) != null)) {
        user.getProfile().setProfileImageUrl(getImageUri().toString());
    }
    persisted.setCurrentUser(user);
    MainActivity.Builder.create(this).startActivityClearTop();
}