@java.lang.Override
public void onSelect(int position) {
    currentPos = position;
    mItem = getItem(position);
    updateBottom();
    topTitle.setText((((("(" + (position + 1)) + "/") + (getAllDatasSize())) + ")"));
}