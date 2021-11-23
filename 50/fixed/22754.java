@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isTermsAndConditiionLoaded)) {
        isTermsAndConditiionLoaded = true;
        webContentDisplayScreenlet.load();
    }
    goRight();
}