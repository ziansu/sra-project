@java.lang.Override
public void onUsersLoaded(java.util.List<mobymagic.com.javalagos.data.model.User> users) {
    mobymagic.com.javalagos.utils.LogUtils.d(mobymagic.com.javalagos.ui.userslist.BaseUserListFragment.LOG_TAG, "Hot jellof rice served");
    for (mobymagic.com.javalagos.data.model.User user : users) {
        mPlaceHolderView.addView(new mobymagic.com.javalagos.ui.userslist.UserView(getActivity(), user));
    }
    setNextPage(((getNextPage()) + 1));
    mPlaceHolderView.loadingDone();
}