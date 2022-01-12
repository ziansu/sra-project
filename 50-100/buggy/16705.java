public void help() {
    speech();
    promptSpeechInput();
    if (needhelp) {
    }else {
        exittimer = false;
        new android.os.CountDownTimer(waitSeconds, 1000) {
            @java.lang.Override
            public void onTick(long millisUntilFinished) {
                if ((exittimer) == true) {
                    cancel();
                }
            }

            @java.lang.Override
            public void onFinish() {
                if ((exittimer) == false) {
                    sendSmsByManager();
                }
            }
        }.start();
    }
}