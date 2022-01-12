public void onEditButtons(android.view.MenuItem item) {
    android.widget.TextView textView;
    textView = ((android.widget.TextView) (findViewById(R.id.text_mode)));
    if (editing) {
        item.setIcon(R.drawable.ic_menu_edit);
        textView.setText(R.string.play_mode);
        editing = false;
    }else {
        item.setIcon(R.drawable.ic_menu_play_clip);
        textView.setText(R.string.edit_mode);
        editing = true;
    }
    mAdapter.setEditing(editing);
}