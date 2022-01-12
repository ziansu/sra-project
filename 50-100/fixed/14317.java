@java.lang.Override
protected void onPostExecute(okhttp3.Response response) {
    com.vedidev.restifizer.RestifizerCallback callback = this.callback;
    if (callback == null) {
        return ;
    }
    if (response.isSuccessful()) {
        try {
            callback.onCallback(new com.vedidev.restifizer.RestifizerResponse(request, this.fetchList, response.body().string(), tag));
        } catch (java.io.IOException e) {
            error(request, response);
        }
    }else {
        error(request, response);
    }
}