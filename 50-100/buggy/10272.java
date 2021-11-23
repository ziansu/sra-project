@java.lang.Override
public void uploadProgress(com.lzy.okgo.model.Progress innerProgress) {
    okhttp3.Call rawCall = request.getRawCall();
    if (rawCall.isCanceled())
        return ;
    
    if ((progress.status) != (com.lzy.okgo.model.Progress.LOADING)) {
        rawCall.cancel();
        return ;
    }
    progress.from(innerProgress);
    postLoading(progress);
}