@java.lang.Override
public void onClick(android.view.View v) {
    if ((OnItemClickListener) != null) {
        int id = ((int) (v.getTag()));
        OnItemClickListener.onItemClick(id);
    }
}