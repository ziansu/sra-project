@java.lang.Override
public void onTick(long millisUntilFinished) {
    com.example.puC.super42.MainActivity.myview.updateTime((((int) (millisUntilFinished)) / 1000));
    if ((com.example.puC.super42.MainActivity.regularGame.getAlive()) == false) {
        timer.cancel();
    }
    if ((currentpower) != null) {
        com.example.puC.super42.MainActivity.myview.updatePowerDescription(currentpower.getDescription());
    }else {
        com.example.puC.super42.MainActivity.myview.updatePowerDescription("No power");
    }
}