@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
        case R.id.action_finish :
            setResult(BaseActivity.CODE_RESULT_CHANGED);
            finish();
            break;
    }
    return true;
}