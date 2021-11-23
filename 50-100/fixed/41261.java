@java.lang.Override
public void onClick(android.view.View button) {
    if (!(parent.isNetworkConnected())) {
        android.widget.Toast.makeText(parent, "Check Internet Connection", Toast.LENGTH_SHORT).show();
        return ;
    }
    confirm.setVisibility(View.GONE);
    reject.setVisibility(View.GONE);
    delete.setVisibility(View.VISIBLE);
    object.setConfirm(parent);
}