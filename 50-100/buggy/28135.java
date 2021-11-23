public static void showLog() {
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