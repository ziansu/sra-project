@java.lang.Override
public void onFinish() {
    if (drop) {
        if (!(missing)) {
            if ((measure.successes) > 0) {
                (measure.successes)--;
                (measure.attempts)--;
            }
        }else
            if (((measure.attempts) - (measure.successes)) > 0)
                (measure.attempts)--;
            
        
        countDownTimer.start();
    }
    update(measure, false);
}