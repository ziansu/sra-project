@java.lang.Override
public void onResume() {
    com.jinjunhang.player.utils.LogHelper.d(com.jinjunhang.onlineclass.ui.fragment.user.PersonalInfoFragment.TAG, "onResume called");
    super.onResume();
    mAdapter.notifyDataSetChanged();
    com.jinjunhang.onlineclass.model.LoginUser loginUser = com.jinjunhang.onlineclass.db.LoginUserDao.getInstance(getActivity()).get();
    mItems.get(0).setOtherInfo(loginUser.getName());
    mItems.get(1).setOtherInfo(loginUser.getNickName());
}