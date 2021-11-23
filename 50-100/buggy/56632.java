public void setVisible(android.widget.ListView listView) {
    int listLength = getCount();
    android.widget.RelativeLayout view;
    android.widget.ImageButton button;
    for (int i = 0; i < listLength; i++) {
        view = ((android.widget.RelativeLayout) (listView.getChildAt(i)));
        button = ((android.widget.ImageButton) (view.findViewById(R.id.delete_item_button)));
        button.setVisibility(View.VISIBLE);
    }
}