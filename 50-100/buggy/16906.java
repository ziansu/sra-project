@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            {
                setResult(de.ur.mi.fashionapp.edit.piece.RESULT_CANCELED);
                finish();
                break;
            }
        case R.id.menu_piece_edit_save :
            setResult(de.ur.mi.fashionapp.edit.piece.RESULT_OK);
            if ((editItem) == null) {
                createPiece();
            }else {
                android.util.Log.d("update", editItem.getID().toString());
                updatePiece();
            }
            break;
    }
    return super.onOptionsItemSelected(item);
}