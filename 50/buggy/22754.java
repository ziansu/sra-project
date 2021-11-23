@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isTermsAndConditiionLoaded)) {
        webContentDisplayScreenlet.load();
    }
    goRight();
}