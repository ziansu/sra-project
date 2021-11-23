@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            save();
            return true;
        case R.id.colour :
            pickColour();
            return true;
        case R.id.action_draw :
            drawNote();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}