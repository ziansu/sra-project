public void startCountdownGame() {
    if (((countDownTask) != null) && ((countDownTask.getStatus()) == (AsyncTask.Status.FINISHED))) {
        countDownTask = null;
    }
    if ((countDownTask) == null) {
        countDownTask = new com.example.gary.simon.MainActivity.CountDownTask();
        countDownTask.execute();
    }
}