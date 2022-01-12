@java.lang.Override
public void onNext(T t) {
    if ((t.contentLength()) == 0) {
        return ;
    }
    if ((httpCallback) != null) {
        try {
            this.httpCallback.onResolve(new com.google.gson.Gson().fromJson(t.string(), this.httpCallback.getType()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}