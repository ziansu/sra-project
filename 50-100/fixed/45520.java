@java.lang.Override
public void onClick(android.view.View v) {
    if (!(br.com.adley.myseriesproject.library.Utils.checkAppConnectionStatus(getContext()))) {
        android.support.design.widget.Snackbar.make(mNoInternetConnection, getActivity().getString(R.string.cant_load_favorites), Snackbar.LENGTH_LONG).show();
    }else {
        executeFavoriteList();
    }
}