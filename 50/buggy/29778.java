@java.lang.Override
public void onCalled(com.johnsimon.payback.core.User _user) {
    user = _user;
    contactsLoader.execute(contentResolver);
}