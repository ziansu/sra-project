@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (getActivity().findViewById(R.id.webview_toolbar)));
    toolbar.setSubtitle(R.string.subtitle);
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.setSupportActionBar(toolbar);
}