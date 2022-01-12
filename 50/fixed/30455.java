public static void businessDispatch(int tag, com.paul.okhttpframework.okhttp.bean.RequestBean requestBean, com.paul.okhttpframework.okhttp.callback.IResultCallback iResultCallback) {
    com.paul.okhttpframework.okhttp.manager.OkBD.setIntResultCallback(tag, iResultCallback);
    com.paul.okhttpframework.okhttp.manager.OkBD.sendRequest(requestBean, tag);
}