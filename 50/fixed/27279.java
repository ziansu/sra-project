@java.lang.Override
public void onClick(android.view.View v) {
    if ((OnItemClickListener) != null) {
        java.lang.String id = ((java.lang.String) (v.getTag()));
        OnItemClickListener.onItemClick(id);
    }
}