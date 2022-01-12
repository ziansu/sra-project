@java.lang.Override
public void onClick(android.view.View v) {
    StatButton.startAnimation(ButtonAnim_out);
    ShareButton.startAnimation(ButtonAnim_out_late);
    android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            LayStat.setVisibility(View.INVISIBLE);
            LayEvetHayir.setVisibility(View.VISIBLE);
            evetButton.startAnimation(ButtonAnim_in);
            hayirButton.startAnimation(ButtonAnim_in);
        }
    }, 800);
    sonrakisoru();
}