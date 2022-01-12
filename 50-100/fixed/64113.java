public void blink(final android.view.View v, final com.example.hari.simpletodo.Models.Item item) {
    v.animate().setDuration(600).alpha(0).withEndAction(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            v.setAlpha(1);
            item.shouldHighlight = false;
        }
    });
}