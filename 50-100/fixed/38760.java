@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, final android.view.View view, int position, long id) {
    java.lang.String item = ((java.lang.String) (lvToDos.getItemAtPosition(position)));
    com.yeahdev.todoapp.helper.Util.buildConfirmDialog(this, lvToDos, Constants.BASEURL, Constants.ROUTE, Constants.DELETEDROUTE, userId, item);
    return true;
}