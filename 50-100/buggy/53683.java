@java.lang.Override
public void run() {
    mRequest = null;
    final org.quantumbadger.redreader.activities.LinearLayout layout = new org.quantumbadger.redreader.activities.LinearLayout(context);
    final org.quantumbadger.redreader.views.liststatus.ErrorView errorView = new org.quantumbadger.redreader.views.liststatus.ErrorView(this, error);
    layout.addView(errorView);
    errorView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
    setMainView(layout);
}