public void resetTimer(int newTime) {
    edu.ipfw.sumfun.TimedGame.DURATION = newTime;
    edu.ipfw.sumfun.TimedGame.t.cancel();
    edu.ipfw.sumfun.TimedGame.t.scheduleAtFixedRate(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            edu.ipfw.sumfun.TimedGame.DURATION = (edu.ipfw.sumfun.TimedGame.DURATION) - (edu.ipfw.sumfun.TimedGame.TICK);
            setChanged();
            notifyObservers();
            if ((edu.ipfw.sumfun.TimedGame.DURATION) <= 0) {
                edu.ipfw.sumfun.TimedGame.t.cancel();
            }
        }
    }, 0, 1000);
}