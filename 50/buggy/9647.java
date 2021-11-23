@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mobidev.com.notesfeed.User accessUser = ((mobidev.com.notesfeed.User) (savedInstanceState.getSerializable("currentUser")));
    java.lang.String userId = accessUser.getUserId();
}