@java.lang.Override
public void onTick(long millisUntilFinished) {
    blackTimeLeft = millisUntilFinished;
    tvBlack.setText((((((blackTimeLeft) / 1000) + " ( ") + (blackPeriodsLeft)) + " )"));
}