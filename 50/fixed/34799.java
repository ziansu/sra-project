@java.lang.Override
public void onObjectReceived(com.android_project.grocery.model.entities.User user) {
    if (user != null) {
        addNewUserToLocal(user);
    }
    handler.onObjectReceived(user);
}