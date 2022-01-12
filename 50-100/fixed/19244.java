private void initialization() {
    setContentView(R.layout.activity_start_screen);
    findViewById(R.id.fullscreen_content_controls).setVisibility(View.VISIBLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    com.captainhampton.android.lightsout.LOUtils.applyFont(this, R.id.start_screen_text, LOUtils.FONT_GEAR);
    findViewById(R.id.start_button).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            startActivity(new android.content.Intent(com.captainhampton.android.lightsout.activity.ActivityStartScreen.this, com.captainhampton.android.lightsout.activity.ActivityMain.class));
        }
    });
}