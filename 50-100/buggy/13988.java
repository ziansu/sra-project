public cn.ximoon.rxretrofitframework.logic.processor.NetProcessor getUser(cn.ximoon.rxretrofitframework.core.callback.NetResultCallback<cn.ximoon.rxretrofitframework.bean.UserBean> callback) {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    params.put("name", "username");
    params.put("psw", "userpsw");
    return cn.ximoon.rxretrofitframework.logic.processor.NetProcessor.get().onCallback(callback).onRetry(true).onClazz(cn.ximoon.rxretrofitframework.bean.UserBean.class).onUrl("/get/user").onQueryMap(params).excute();
}