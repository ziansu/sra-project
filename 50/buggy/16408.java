@java.lang.Override
public void onNext(com.example.administrator.gc.model.IndexModel indexModel) {
    if (null != (view)) {
        if (!swipe) {
            view.stopRefresh();
        }
        view.stopLoading();
        view.notifyHotDataChange(indexModel);
    }
}