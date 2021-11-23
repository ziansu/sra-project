@java.lang.Override
public void error(int error) {
    switch (error) {
        case com.xmx.qust.common.user.UserConstants.CANNOT_CHECK_LOGIN :
        case com.xmx.qust.common.user.UserConstants.NOT_LOGGED_IN :
            showToast("请在侧边栏中选择登录");
            break;
        case com.xmx.qust.common.user.UserConstants.USERNAME_ERROR :
            showToast("请在侧边栏中选择登录");
            break;
        case com.xmx.qust.common.user.UserConstants.CHECKSUM_ERROR :
            showToast("登录过期，请在侧边栏中重新登录");
            break;
    }
}