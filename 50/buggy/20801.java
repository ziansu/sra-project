@java.lang.Override
public void updateProgress(int n) {
    if (n >= 100) {
        setIsFinishedLoading();
    }else {
        setIsLoading();
    }
    mProgressBar.setProgress(n);
}