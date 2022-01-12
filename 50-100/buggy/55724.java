@java.lang.Override
public void run() {
    final boolean isAttending = event.isAttending();
    event.setAttending((!isAttending));
    amai.org.conventions.model.Convention.getInstance().getStorage().saveUserInput();
    notifyDataSetChanged();
    if (isAttending) {
        android.support.design.widget.Snackbar.make(recyclerView, R.string.event_added_to_favorites, Snackbar.LENGTH_SHORT).show();
    }else {
        android.support.design.widget.Snackbar.make(recyclerView, R.string.event_removed_from_favorites, Snackbar.LENGTH_SHORT).show();
    }
}