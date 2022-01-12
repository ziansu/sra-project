public java.lang.String getError(java.lang.Throwable e) {
    if (e instanceof retrofit2.adapter.rxjava.HttpException) {
        try {
            com.kilogramm.mattermost.model.error.HttpError error = new com.google.gson.Gson().fromJson(((retrofit2.adapter.rxjava.HttpException) (e)).response().errorBody().string(), com.kilogramm.mattermost.model.error.HttpError.class);
            return error == null ? error.getError() : error.getMessage();
        } catch (java.io.IOException e1) {
            return e.getMessage();
        }
    }else {
        return e.getMessage();
    }
}