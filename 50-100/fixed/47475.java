@java.lang.Override
public void onUserChanged(com.example.alex.motoproject.screenOnlineUsers.OnlineUser user) {
    mPresenter.addOrUpdateUser(user);
    for (com.example.alex.motoproject.screenOnlineUsers.OnlineUser iteratedUser : mUsers) {
        if (iteratedUser.getUid().equals(user.getUid())) {
            mUsers.set(mUsers.indexOf(iteratedUser), user);
            return ;
        }
    }
}