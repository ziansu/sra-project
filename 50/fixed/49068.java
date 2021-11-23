@java.lang.Override
public void onClick(android.view.View view) {
    mainActivity.onClickItem(getAdapterPosition());
    selectedItem = getAdapterPosition();
    notifyDataSetChanged();
}