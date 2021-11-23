@java.lang.Override
public void onClick(android.view.View view) {
    if ((listener) != null) {
        listener.onItemClicked(getAdapterPosition(), ((getAdapterPosition()) + 1));
    }
}