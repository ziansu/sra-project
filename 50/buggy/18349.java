@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    if ((asyncGetTaskes) == null) {
        asyncGetTaskes = new com.example.doctorsbuilding.nav.DialogAddTurn.asyncCallGetTaskes();
        asyncGetTaskes.execute();
    }
}