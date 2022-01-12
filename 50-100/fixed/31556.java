@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    if (menuInfo instanceof android.widget.AdapterView.AdapterContextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo acmi = ((android.widget.AdapterView.AdapterContextMenuInfo) (menuInfo));
        java.lang.System.out.println((">>>>> pos -> " + (acmi.position)));
    }else {
    }
    getMenuInflater().inflate(R.menu.menu_example, menu);
    super.onCreateContextMenu(menu, v, menuInfo);
}