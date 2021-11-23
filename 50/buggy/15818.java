@java.lang.Override
public void onStartLoadingFrame(PageGuest.StartLoadingEvent event) {
    if (event.isMainFrame()) {
        java.lang.System.out.println("Main frame has started loading");
    }
}