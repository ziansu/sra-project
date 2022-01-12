@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.wordpress.android.util.AppLog.v(T.NUX, "NewAccountAbstractOage.onCreate()");
    mSystemService = ((android.net.ConnectivityManager) (getActivity().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE)));
    if ((org.wordpress.android.ui.accounts.AbstractFragment.requestQueue) == null) {
        org.wordpress.android.ui.accounts.AbstractFragment.requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(getActivity());
    }
}