public void pauseCallBack() {
    android.widget.ImageButton ib1 = ((android.widget.ImageButton) (findViewById(firstID.intValue())));
    android.widget.ImageButton ib2 = ((android.widget.ImageButton) (findViewById(secondID.intValue())));
    setImage(ib2, "blank");
    setImage(ib1, "blank");
    guard = 0;
}