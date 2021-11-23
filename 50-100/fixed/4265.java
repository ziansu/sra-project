@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = ((org.wikipedia.WikipediaApp) (getActivity().getApplicationContext()));
    model = new org.wikipedia.page.PageViewModel();
    if (org.wikipedia.settings.Prefs.isExperimentalPageLoadEnabled()) {
        pageLoadStrategy = new org.wikipedia.page.HtmlPageLoadStrategy();
    }else {
        pageLoadStrategy = new org.wikipedia.page.JsonPageLoadStrategy();
    }
}