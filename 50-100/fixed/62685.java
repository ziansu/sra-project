public void changeBackgroundClick(android.view.View view) {
    android.widget.ImageButton changeButton = ((android.widget.ImageButton) (findViewById(R.id.ChangeBackground)));
    if (backgroundToggleOn) {
        changeButton.setImageResource(R.drawable.paintrollericon);
    }else {
        changeButton.setImageResource(R.drawable.penicon);
    }
    backgroundToggleOn = !(backgroundToggleOn);
}