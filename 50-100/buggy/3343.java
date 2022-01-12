@java.lang.Override
protected java.lang.Void doInBackground(tr.edu.iyte.caffeine.CaffeineService.Clock... c) {
    tr.edu.iyte.caffeine.CaffeineService.Clock clock = c[0];
    try {
        if ((tr.edu.iyte.caffeine.CaffeineService.mode) == (tr.edu.iyte.caffeine.CaffeineService.Mode.INFINITE_MINS)) {
            while (!(java.lang.Thread.interrupted()))
                java.lang.Thread.sleep(30000);
            
        }else {
            waitAndUpdate(clock);
            while (clock.decrement())
                waitAndUpdate(clock);
            
        }
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e(tr.edu.iyte.caffeine.CaffeineService.TAG, "doInBackground: Caffeine mode changed", e);
    }
    return null;
}