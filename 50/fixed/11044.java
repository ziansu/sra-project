@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    webModel.setIsLoading(isLoading);
    webModel.notifyObservers();
}