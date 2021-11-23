@java.lang.Override
public void onClick(android.view.View v) {
    android.media.MediaPlayer nextButtonMediaPlayer = android.media.MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
    nextButtonMediaPlayer.start();
    (shipCount)++;
    if ((shipCount) < 10) {
        shipView.setImageResource(shipImages[shipCount]);
        shipNo.setText(shipName[shipCount]);
    }else
        if ((shipCount) == 10) {
            shipCount = 0;
            shipView.setImageResource(shipImages[shipCount]);
            shipNo.setText(shipName[shipCount]);
        }
    
}