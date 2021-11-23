@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
    android.support.design.widget.Snackbar.make(v, ("Click detected on item " + position), Snackbar.LENGTH_LONG).setAction("Action", null).show();
}