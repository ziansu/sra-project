private void stopTimer() {
    if ((((timer) == null) || ((viewPager) == null)) || (timer.isStopped)) {
        s = $missing$;
        return ;
    }
    viewPager.removeOnPageChangeListener(timer);
    timer.removeCallbacksAndMessages(null);
    timer.listener = null;
    timer.isStopped = true;
}