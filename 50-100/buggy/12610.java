@java.lang.Override
public void onClick(android.view.View v) {
    if (((org.naturenet.NatureNetApplication) (getActivity().getApplication())).isConnected()) {
        join_ib.setVisibility(View.GONE);
        main.goToJoinActivity();
    }else {
        android.widget.Toast.makeText(main, R.string.no_connection, Toast.LENGTH_SHORT).show();
    }
}