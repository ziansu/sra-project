@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            if ((this.task) != null) {
                this.task.setRunning(false);
            }
            this.finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}