@java.lang.Override
public void onSuccess(java.util.List<com.foodie.app.entities.Activity> data) {
    com.foodie.app.listsDB.ContentResolverDatabase.setActivityList(data, size);
    callBack.onSuccess(null);
}