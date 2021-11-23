@java.lang.Override
public void dataHandler(com.huake.bondmaster.model.bean.UserBean userBean) {
    if (userBean != null) {
        mView.loginSuccess(userBean);
        dataManager.setUserInstance(userBean);
    }else {
        mView.showErrorMsg("登陆失败");
    }
}