private void updateTitle() {
    android.widget.ImageButton image = ((android.widget.ImageButton) (findViewById(R.id.title_button_1)));
    image.clearAnimation();
    image = ((android.widget.ImageButton) (findViewById(R.id.title_button_2)));
    image.clearAnimation();
    if (varUnread) {
        image.setBackgroundResource((varBack = R.drawable.btn_bg_pressed));
        varUnread = false;
    }
}