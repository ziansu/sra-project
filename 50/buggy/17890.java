@android.annotation.SuppressLint(value = "ShowToast")
@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_setting :
            android.widget.Toast.makeText(this, "setting", Toast.LENGTH_SHORT);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}