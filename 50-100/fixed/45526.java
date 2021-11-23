@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getPageManager().setDebug(true);
    getPageManager().enableSwipeToHide(true);
    getPageManager().useSwipePageTransitionEffect();
    if (savedInstanceState == null) {
        new net.neevek.android.demo.paginize.pages.MainPage(this).show(false);
    }
}