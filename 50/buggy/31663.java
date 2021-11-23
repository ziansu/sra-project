public void run() {
    (muleGame.timeRemaining)--;
    java.lang.System.out.println(muleGame.timeRemaining);
    if ((muleGame.timeRemaining) == 0) {
        java.lang.System.out.print("TURN ENDED");
        muleGame.t.cancel();
    }
}