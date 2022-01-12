@java.lang.Override
public void onItemDismiss(int position) {
    projectItemList.remove(position);
    io.paperdb.Paper.put("projects", projectItemList);
    notifyItemRemoved(position);
}