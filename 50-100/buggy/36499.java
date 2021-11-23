public void buttonMiniature(android.view.View view) {
    android.widget.ImageView background = ((android.widget.ImageView) (findViewById(R.id.background)));
    android.widget.ImageButton miniature = ((android.widget.ImageButton) (view));
    if (modeMiniature) {
        modeMiniature = false;
        miniature.setImageResource(R.drawable.minimise);
        setBackground();
    }else {
        modeMiniature = true;
        miniature.setImageResource(R.drawable.maximise);
        setParamsMiniature(background, true);
    }
}