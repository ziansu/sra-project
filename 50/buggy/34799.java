@java.lang.Override
public void onObjectReceived(com.android_project.grocery.model.entities.User user) {
    addNewUserToLocal(user);
    handler.onObjectReceived(user);
}