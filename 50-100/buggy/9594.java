@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    android.widget.Toast.makeText(this, ((getResources().getResourceEntryName(item.getItemId())) + ""), Toast.LENGTH_LONG).show();
    switch (item.getItemId()) {
        case R.id.home :
            onBackPressed();
            return true;
        case R.id.action_help :
            startInstruction();
            return true;
        case R.id.action_replay :
            speakTextInstruction(currentTest);
            return true;
    }
    return false;
}