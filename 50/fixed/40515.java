@java.lang.Override
public void onClick(android.view.View v) {
    list.remove(position);
    notifyDataSetChanged();
    tattoo.tags = list;
}