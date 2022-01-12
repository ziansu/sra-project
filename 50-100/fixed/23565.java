@java.lang.Override
public void onBackPressed() {
    if (com.jchingdev.squares.singleplayer.Chartboost.onBackPressed()) {
        return ;
    }else {
        if ((timer) != null)
            timer.cancel();
        
        android.content.Intent intent = new android.content.Intent(this, com.jchingdev.squares.GameModeMenu.class);
        finish();
        startActivity(intent);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}