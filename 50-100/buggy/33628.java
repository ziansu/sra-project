public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_orders :
            dailymilk.com.dailymilk.BackgroundWorker backgroundWorker = new dailymilk.com.dailymilk.BackgroundWorker(this);
            backgroundWorker.execute("view", username);
            break;
        case R.id.home :
            setCredentialsBack();
            this.finish();
            android.content.Intent intent = new android.content.Intent(this, dailymilk.com.dailymilk.LoginActivity.class);
            this.startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
    return true;
}