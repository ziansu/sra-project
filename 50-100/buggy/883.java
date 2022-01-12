@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.regActivity :
            android.content.Intent goToRegister;
            goToRegister = new android.content.Intent(getApplicationContext(), com.example.abhi.saarangbeta.regActivity.class);
            goToRegister.putExtra(com.example.abhi.saarangbeta.displayDetails.REG_MESSAGE, dataInfo);
            startActivity(goToRegister);
            break;
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            break;
        default :
            return super.onOptionsItemSelected(item);
    }
    return true;
}