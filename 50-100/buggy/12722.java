@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    try {
        new com.example.llh_pc.it_support.utils.Dialogs.DialogDefault(this.getParent()).showConfirmCloseApp();
    } catch (java.lang.Exception e) {
        android.util.Log.e("error", e.getMessage());
        e.printStackTrace();
    }
    return false;
}