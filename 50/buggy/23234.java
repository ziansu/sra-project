private void handleError(java.lang.Throwable throwable) {
    if (throwable instanceof com.chubarich.mobiweather.data.db.exceptions.NoCachedWeatherException) {
        if ((view) != null)
            view.showError();
        
    }
    if ((view) != null)
        view.hideLoading();
    
}