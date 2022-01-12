@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.changeName :
            android.content.Intent intent = new android.content.Intent(this, se.chalmers.eda397.team9.cardsagainsthumanity.IndexActivity.class);
            startActivity(intent);
            return true;
        case R.id.changeTable :
            return true;
        case R.id.settings :
            return true;
        case R.id.help :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}