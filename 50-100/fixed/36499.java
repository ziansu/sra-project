public void buttonMiniature(android.view.View view) {
    android.widget.ImageView background = ((android.widget.ImageView) (findViewById(R.id.background)));
    android.widget.ImageButton miniature = ((android.widget.ImageButton) (view));
    if (!(modeMiniature)) {
        miniature.setImageResource(R.drawable.minimise);
        setBackground();
    }else {
        miniature.setImageResource(R.drawable.maximise);
        setParamsMiniature(background, true);
    }
}