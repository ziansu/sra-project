private void sendBack(final java.lang.String name, final int val, final boolean update) {
    main.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (org.flg.hiromi.pulsecontroller.PulseCommChannel.IntWatcher iw : getWatchers(name)) {
                try {
                    iw.onChange(name, val, update);
                } catch (java.lang.Error | java.lang.Exception t) {
                    android.util.Log.e("SVC", "Error while reporting change.", t);
                    sendError(t);
                }
            }
        }
    });
}