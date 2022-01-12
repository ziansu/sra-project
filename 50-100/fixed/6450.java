@java.lang.Override
public void updatePause(final boolean enabled, final boolean pauseResume) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.lang.String str = tk.thebrightstuff.blindtale.utils.StringUtils.capitalize(getResources().getString((pauseResume ? R.string.pause : R.string.resume)));
            findViewById(R.id.button_skip).setEnabled(enabled);
        }
    });
}