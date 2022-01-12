@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (title) {
        case R.string.save :
            save();
            break;
        case R.string.discard :
            loadCurrentList();
            adapter.notifyDataSetChanged();
            break;
        case R.string.reset :
            loadDefaultList();
            break;
    }
}