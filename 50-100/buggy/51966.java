@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.doneItem :
            (com.example.attracti.audiorecorderpicture.activities.AudioRecord.done)++;
            android.content.Intent firstScreen = new android.content.Intent(getApplicationContext(), com.example.attracti.audiorecorderpicture.activities.FirstscreenActivity.class);
            firstScreen.putExtra("SWAP", true);
            startActivity(firstScreen);
            finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}