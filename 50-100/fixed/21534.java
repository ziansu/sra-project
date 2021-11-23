private void stopTimer() {
    if ((((timer) == null) || ((viewPager) == null)) || (timer.isStopped)) {
        return ;
    }
    timer.removeCallbacksAndMessages(null);
    timer.listener = null;
    timer.isStopped = true;
}