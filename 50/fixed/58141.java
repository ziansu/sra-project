@java.lang.Override
public boolean onLongClick(android.view.View v) {
    com.legitdevs.legitnotes.EditDialog.getInstance(notes.get(position), position).show(((com.legitdevs.legitnotes.HomeActivity) (ctx)).getSupportFragmentManager(), "dialog");
    return true;
}