@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if ((downloadQueue.size()) > 0)
        downloadItemDetail();
    else
        displayNews();
    
}