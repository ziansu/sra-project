@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    switch (motionEvent.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            setgamefield_start.setBackgroundResource(R.drawable.ic_setgamefield_playclicked);
            break;
        case android.view.MotionEvent.ACTION_UP :
            setgamefield_start.setBackgroundResource(R.drawable.ic_setgamefield_play);
            android.content.Intent sgf_to_gameplay = new android.content.Intent(getBaseContext(), com.example.myapplication.Gameplay.class);
            java.lang.String gameFieldInfo = ((fieldWidth) + ";") + (fieldHeight);
            sgf_to_gameplay.putExtra("GAME_FIELD_KEY", gameFieldInfo);
            sgf_to_gameplay.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(sgf_to_gameplay);
            break;
    }
    return true;
}