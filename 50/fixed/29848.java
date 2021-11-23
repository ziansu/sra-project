@java.lang.Override
public void done() {
    context = getContext();
    if ((context) != null) {
        progressDialog = android.app.ProgressDialog.show(getContext(), "", "正在加载");
        getInfo();
    }
}