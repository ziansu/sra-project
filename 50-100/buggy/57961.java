@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.card :
            android.widget.Toast.makeText(this, "card", Toast.LENGTH_SHORT).show();
            break;
        case R.id.addItem :
            isStorage = false;
            storageFragment = null;
            android.widget.Toast.makeText(this, "Add item", Toast.LENGTH_SHORT).show();
            clearFragmentStack();
            createEditor(null);
        default :
            break;
    }
    return true;
}