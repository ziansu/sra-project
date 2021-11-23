@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(getBaseContext(), ("item clicado " + position), Toast.LENGTH_SHORT).show();
    openUserEditor(arrayUsersId[position]);
}