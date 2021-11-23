@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    boolean result = super.onCreateOptionsMenu(menu);
    menu.add(0, com.android.demo.notepad1.Notepadv1.INSERT_ID, 0, R.string.menu_insert);
    return result;
}