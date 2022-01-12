@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((progressDialog) != null)
        progressDialog.dismiss();
    
    getActivity().finish();
}