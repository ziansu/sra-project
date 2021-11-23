@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null) {
        if (!(listener.onGroupClick(getAdapterPosition()))) {
            expand();
        }else {
            collapse();
        }
    }
}