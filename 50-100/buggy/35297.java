@java.lang.Override
public void onFinish(java.lang.CharSequence text) {
    try {
        java.lang.String info = "";
        if (mFinder.createFile(text.toString(), ((typeToCreate) == (me.sxwang.afinder.ui.MainActivity.CREATE_FOLDER)))) {
            info = "Success";
        }else {
            info = "Failed";
        }
        android.widget.Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}