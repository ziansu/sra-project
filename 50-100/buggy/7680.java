@java.lang.Override
public void onNext(T t) {
    if ((t.contentLength()) == 0) {
        return ;
    }
    if (((httpCallback) != null) && ((httpCallback.getType()) != null)) {
        try {
            httpCallback.onResolve(new com.google.gson.Gson().fromJson(t.charStream(), httpCallback.getType()));
        } catch (java.lang.Exception e) {
            httpCallback.onFailure("", "data resolve error,please check the json response");
            e.printStackTrace();
        }
    }
}