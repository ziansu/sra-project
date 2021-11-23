private void onPageChanged(int page) {
    model.updateLatestPage(page);
    lastPage = page;
    if ((minimumPage) == (com.quran.labs.androidquran.data.Constants.NO_PAGE)) {
        minimumPage = page;
        maximumPage = page;
    }else
        if (page < (minimumPage)) {
            minimumPage = page;
        }else
            if (page > (maximumPage)) {
                maximumPage = page;
            }
        
    
}