public void setMinutsTimer() {
    timer = new java.util.Timer();
    timer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            timplannerActivity.runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    checkIfSubjectActiv();
                }
            });
        }
    }, 0, ((1000 * 1) * 60));
}