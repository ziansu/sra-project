@java.lang.Override
public void onSuccess(cn.lenovo.microreadpro.model.MCollection model) {
    if (model.getCode().equals("0")) {
        java.lang.String collectionJson = new com.google.gson.Gson().toJson(model.getCollections());
        mApp.aCache.put("artical", collectionJson);
    }else {
        view.getCollectionFail(model.getInfo());
    }
    view.getCollectionSuccess(model.getCollections());
}