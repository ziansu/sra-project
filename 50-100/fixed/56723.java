@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
        case R.id.action_share :
            if (newContact)
                return false;
            
            sneer.android.utils.Puk.sharePublicKey(this, party, false, sneer.android.SneerAndroidSingleton.sneer().findContact(party).nickname().current());
            break;
    }
    return true;
}