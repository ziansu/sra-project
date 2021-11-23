@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((parent.getId()) == (R.id.threads_spinner)) {
        if ((seite) != (position + 1)) {
            java.lang.System.out.println(((("seite: " + (seite)) + " pos: ") + position));
            seite = position + 1;
            postTask = new de.btcdev.eliteanimesapp.gui.PostActivity.PostTask();
            postTask.execute("");
        }
    }
}