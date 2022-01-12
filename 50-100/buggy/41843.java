public void repeatGetLocationName() {
    final android.os.Handler handler = new android.os.Handler();
    java.util.Timer timer = new java.util.Timer();
    java.util.TimerTask doAsynchronousTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            handler.post(new java.lang.Runnable() {
                public void run() {
                    try {
                        new gr.qpc.meteoclimaandroid.MeteoclimaMainFragment.GetLocationName(getActivity()).execute();
                    } catch (java.lang.Exception e) {
                    }
                }
            });
        }
    };
    timer.schedule(doAsynchronousTask, 10000);
}