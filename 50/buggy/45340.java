@java.lang.Override
public void onClick(android.content.DialogInterface dlg, int position) {
    if (position == 0) {
        createNewSetList();
        unCheckAllSelectedItems();
    }else {
        addLyricsToSetList(items[position]);
        unCheckAllSelectedItems();
    }
}