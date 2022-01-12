@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (android.R.id.home)) {
        back();
        return true;
    }else
        if (id == (R.id.action_save)) {
            save();
            android.content.Intent resultIntent = new android.content.Intent();
            resultIntent.putExtra("data.id", this.item.getId());
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}