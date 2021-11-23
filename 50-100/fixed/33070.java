@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.train :
            android.content.Intent intentGame = new android.content.Intent(this, com.example.speedtrain.Game.class);
            startActivity(intentGame);
            break;
        case R.id.records :
            android.content.Intent intentRecords = new android.content.Intent(this, com.example.speedtrain.Records.class);
            startActivity(intentRecords);
            break;
        case R.id.quit :
            finish();
            break;
    }
}