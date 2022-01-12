@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if (downloadQueue.isEmpty()) {
        displayNews();
    }else {
        downloadItemDetail();
    }
}