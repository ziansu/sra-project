@java.lang.Override
public void dataHandler(com.huake.bondmaster.model.bean.UserBean userBean) {
    if (userBean != null) {
        dataManager.setUserInstance(userBean);
        mView.loginSuccess(userBean);
    }else {
        mView.showErrorMsg("登陆失败");
    }
}