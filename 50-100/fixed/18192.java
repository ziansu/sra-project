@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.play :
            return true;
        case R.id.previous :
            return true;
        case R.id.next :
            return true;
        case R.id.loop :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}