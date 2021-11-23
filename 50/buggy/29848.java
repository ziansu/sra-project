@java.lang.Override
public void done() {
    progressDialog = android.app.ProgressDialog.show(getContext(), "", "正在加载");
    getInfo();
}