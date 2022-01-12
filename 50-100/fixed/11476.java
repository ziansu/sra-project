@java.lang.Override
public void run() {
    com.yc.english.base.helper.TipsHelper.tips(mContext, "修改成功");
    com.yc.english.main.model.domain.UserInfo userInfo = com.yc.english.main.hepler.UserInfoHelper.getUserInfo();
    userInfo.setAvatar(resultInfo.data.getAvatar());
    com.yc.english.main.hepler.UserInfoHelper.saveUserInfo(userInfo);
    com.hwangjr.rxbus.RxBus.get().post(Constant.USER_INFO, userInfo);
    com.yc.english.base.utils.RongIMUtil.refreshUserInfo();
}