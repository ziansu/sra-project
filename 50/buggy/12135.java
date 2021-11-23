@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(context, context.getResources().getString(R.string.sent_received_dispatch), Toast.LENGTH_SHORT).show();
    db.changeReceiveDispatch(dispatch.getId(), "receive");
    progressDialog.dismiss();
}