@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.startGameButton :
            android.content.Intent intent = new android.content.Intent(this, com.tylersuderman.truenorthgame.GameRoundActivity.class);
            intent.putExtra("songs", org.parceler.Parcels.wrap(songs));
            android.util.Log.d(com.tylersuderman.truenorthgame.GameStartActivity.TAG, ("THIS IS AN ARRAY LIST OF SONG OBJECTS" + (songs)));
            intent.putExtra("artist", org.parceler.Parcels.wrap(artist));
            startActivity(intent);
            break;
    }
}