@java.lang.Override
public void run() {
    mRequest = null;
    final android.widget.LinearLayout layout = new android.widget.LinearLayout(context);
    final org.quantumbadger.redreader.views.liststatus.ErrorView errorView = new org.quantumbadger.redreader.views.liststatus.ErrorView(this, error);
    layout.addView(errorView);
    errorView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
    setMainView(layout);
}