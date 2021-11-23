@java.lang.Override
public void updateProgress(int n) {
    setIsLoading((n < 100));
    mProgressBar.setProgress(n);
}