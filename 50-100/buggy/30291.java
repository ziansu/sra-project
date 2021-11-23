@java.lang.Override
public void onCompletion(com.app.sircle.WebService.DocumentsResponse response, com.app.sircle.Utility.AppError error) {
    if (response != null) {
        if (((response.getData()) != null) && ((response.getData().getNewsLetters()) != null)) {
            com.app.sircle.Manager.DocumentManager.newsLetterList.clear();
            com.app.sircle.Manager.DocumentManager.newsLetterList = response.getData().getNewsLetters();
        }
    }
    getNewsManagerListener.onCompletion(response, error);
}