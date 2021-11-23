@java.lang.Override
public void run() {
    if (success) {
        progressBar.setVisibility(View.GONE);
        refresh();
    }else {
        java.lang.String s1 = getResources().getString(R.string.get_failed_please_check);
        android.widget.Toast.makeText(getActivity(), s1, 1).show();
        progressBar.setVisibility(View.GONE);
    }
}