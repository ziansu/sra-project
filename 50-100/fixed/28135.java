public static void showLog() {
    if (((ru.meefik.linuxdeploy.MainActivity.logView) == null) || ((ru.meefik.linuxdeploy.MainActivity.logScroll) == null))
        return ;
    
    ru.meefik.linuxdeploy.MainActivity.logView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ru.meefik.linuxdeploy.MainActivity.logView.setText(ru.meefik.linuxdeploy.Logger.get());
            ru.meefik.linuxdeploy.MainActivity.logScroll.post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    ru.meefik.linuxdeploy.MainActivity.logScroll.fullScroll(View.FOCUS_DOWN);
                    ru.meefik.linuxdeploy.MainActivity.logScroll.clearFocus();
                }
            });
        }
    });
}