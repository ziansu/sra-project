@java.lang.Override
public void onClick(android.view.View view) {
    mainActivity.onClickItem(view, getAdapterPosition());
    selectedItem = getAdapterPosition();
    notifyDataSetChanged();
}