public cn.ximoon.rxretrofitframework.logic.processor.NetProcessor getUser(cn.ximoon.rxretrofitframework.core.callback.NetResultCallback<cn.ximoon.rxretrofitframework.bean.UserBean> callback) {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    params.put("name", "username");
    params.put("psw", "userpsw");
    return new cn.ximoon.rxretrofitframework.logic.processor.NetProcessor<cn.ximoon.rxretrofitframework.bean.UserBean>().onCallback(callback).onRetry(true).onUrl("/get/user").onQueryMap(params).get();
}