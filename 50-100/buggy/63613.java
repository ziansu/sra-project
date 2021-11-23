public void run() {
    int s = com.hongyu.reward.ui.fragment.startapp.RegisterFragment.max_second;
    while ((s >= 0) || (isAdded())) {
        resetCodeTextOnMainThread(s);
        try {
            java.lang.Thread.sleep(1000);
            s--;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}