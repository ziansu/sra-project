@java.lang.Override
public void paint(float alpha) {
    if ((loadingBar) != null)
        loadingBar.onPercentUpdate(percentComplete);
    
}